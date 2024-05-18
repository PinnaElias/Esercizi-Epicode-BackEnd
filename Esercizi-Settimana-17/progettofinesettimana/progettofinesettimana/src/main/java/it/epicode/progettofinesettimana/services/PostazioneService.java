package it.epicode.progettofinesettimana.services;

import it.epicode.progettofinesettimana.entities.Postazione;
import it.epicode.progettofinesettimana.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class PostazioneService {

    @Autowired
    private PostazioneRepository stationRepo;

    public List<Postazione> getAllStations(){
        return this.stationRepo.findAll();
    }

    public Postazione getStationsById(UUID id){
        return this.stationRepo.findById(id).orElse(null);
    }

    public Postazione saveStation(Postazione postazione){
        return this.stationRepo.save(postazione);
    }

    public void deleteStationById(UUID id){
        this.stationRepo.deleteById(id);
    }

}
