package it.epicode.progettofinesettimana.services;

import it.epicode.progettofinesettimana.DAO.DispositivoDAO;
import it.epicode.progettofinesettimana.DTO.DispositivoDTO;
import it.epicode.progettofinesettimana.entities.Dispositivo;
import it.epicode.progettofinesettimana.enums.TipoDispositivo;
import it.epicode.progettofinesettimana.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DispositivoService {
    @Autowired
    private DispositivoDAO dispositivoDAO;


    public Dispositivo findById(UUID id) {
        return this.dispositivoDAO.findById(id).orElseThrow(() -> new NotFoundException(id));
    }
    public Page<Dispositivo> getDispositivi(int pageNumber, int size, String orderBy) {
        Pageable page = PageRequest.of(pageNumber, size, Sort.by(orderBy));
        return dispositivoDAO.findAll(page);
    }

    public Dispositivo save(DispositivoDTO newdisp) {
        TipoDispositivo statoDispositivo = TipoDispositivo.valueOf(newdisp.disponibile());
        Dispositivo dispositivo= new Dispositivo(newdisp.tipo(), statoDispositivo);
        return dispositivoDAO.save(dispositivo);
    }
    public Dispositivo findAndUpdate (UUID id, Dispositivo update){
        Dispositivo dispositivo=this.findById(id);
        dispositivo.setTipo(update.getTipo());
        dispositivo.setTipoDispositivo(update.getTipoDispositivo());
        return dispositivoDAO.save(dispositivo);
    }

    public void findAndDelete(UUID id){
        Dispositivo found=this.findById(id);
        dispositivoDAO.delete(found);
    }
}
