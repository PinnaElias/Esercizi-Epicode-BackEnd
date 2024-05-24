package it.epicode.progettofinesettimana.services;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import it.epicode.progettofinesettimana.DAO.DipendenteDAO;
import it.epicode.progettofinesettimana.DTO.DipendenteDTO;
import it.epicode.progettofinesettimana.entities.Dipendente;
import it.epicode.progettofinesettimana.entities.Dispositivo;
import it.epicode.progettofinesettimana.enums.TipoDispositivo;
import it.epicode.progettofinesettimana.exceptions.BadRequestException;
import it.epicode.progettofinesettimana.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Service
public class DipendenteService {
    @Autowired
    private DipendenteDAO dipendenteDAO;
    @Autowired
    private Cloudinary cloudinary;
    @Autowired
    private DispositivoService dispositivoService;

    public Page<Dipendente> getDipendenti(int pageNumber, int size, String orderBy) {
        Pageable page = PageRequest.of(pageNumber, size, Sort.by(orderBy));
        return dipendenteDAO.findAll(page);
    }

    public Dipendente findById(UUID id) {
        return dipendenteDAO.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public Dipendente save(DipendenteDTO newuser) {
        dipendenteDAO.findByEmail(newuser.email()).ifPresent(u->{
            throw new BadRequestException("l'email "+ u.getEmail()+" è già esistente");
        });
        Dispositivo dispositivo= dispositivoService.findById(newuser.dispositivo());
        if (dispositivo.getTipoDispositivo()== TipoDispositivo.DISMESSO||dispositivo.getTipoDispositivo()==TipoDispositivo.IN_MANUNTENZIONE){
            dispositivo=null;
        }
        return dipendenteDAO.save(
                new Dipendente(newuser.avatar(),newuser.username(),newuser.name(),newuser.surname(),newuser.email(), dispositivo)
        );
    }
    public Dipendente findAndUpdate (UUID id, Dipendente update){
        Dipendente dipendente=this.findById(id);
        dipendente.setAvatar(update.getAvatar());
        dipendente.setUsername(update.getUsername());
        dipendente.setName(update.getName());
        dipendente.setSurname(update.getSurname());
        dipendente.setEmail(update.getEmail());
        return dipendenteDAO.save(dipendente);
    }

    public void findAndDelete(UUID id){
        Dipendente found=this.findById(id);
        dipendenteDAO.delete(found);
    }

    public String findAndPostAvatar(UUID id, MultipartFile image)throws IOException {
        Dipendente dipendente=this.findById(id);
        String url = (String) cloudinary.uploader().upload(image.getBytes(),
                ObjectUtils.emptyMap()).get("url");
        dipendente.setAvatar(url);
        dipendenteDAO.save(dipendente);
        return url;
    }

    public void findAndPostDisp(UUID id, UUID dispositivoId){
        Dipendente dipendente=this.findById(id);
        Dispositivo dispositivo= dispositivoService.findById(dispositivoId);
        dipendente.setDispositivo(dispositivo);
        dipendenteDAO.save(dipendente);
    }
}
