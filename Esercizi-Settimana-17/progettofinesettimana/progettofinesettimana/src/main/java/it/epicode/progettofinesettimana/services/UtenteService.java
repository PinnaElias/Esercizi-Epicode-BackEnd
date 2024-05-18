package it.epicode.progettofinesettimana.services;

import it.epicode.progettofinesettimana.entities.Utente;
import it.epicode.progettofinesettimana.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UtenteService {

    @Autowired
    private UtenteRepository userRepo;

    public List<Utente> getAllUsers() {
        return this.userRepo.findAll();
    }

    public Utente getUserByUsername(String username) {
        Optional<Utente> user = userRepo.findByUsername(username);
        if (user.isPresent()) {
            return user.get();
        } else {
            return null;
        }
    }

    public Utente saveUser(Utente user) {
        return this.userRepo.save(user);
    }

    public void deleteUser(String username) {

        Optional<Utente> user = userRepo.findByUsername(username);
        if (user.isPresent()) {
            userRepo.delete(user.get());
        }
    }

}
