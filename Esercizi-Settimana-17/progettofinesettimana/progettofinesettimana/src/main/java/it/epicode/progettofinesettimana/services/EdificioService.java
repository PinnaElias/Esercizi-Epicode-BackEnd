package it.epicode.progettofinesettimana.services;

import it.epicode.progettofinesettimana.entities.Edificio;
import it.epicode.progettofinesettimana.repositories.EdificioRepository;

import java.util.List;
import java.util.UUID;

public class EdificioService {

    private EdificioRepository buildingRepo;

    public List<Edificio> getAllBuildings(){
        return this.buildingRepo.findAll();
    }

    public Edificio getBuildingsById(UUID id){
        return this.buildingRepo.findById(id).orElse(null);
    }

    public Edificio saveBuilding(Edificio edificio){
        return this.buildingRepo.save(edificio);
    }

    public void deleteBuildingById(UUID id){
        this.buildingRepo.deleteById(id);
    }
}
