package it.epicode.esercizioday83.services;

import it.epicode.esercizioday83.entities.Drink;
import it.epicode.esercizioday83.repositories.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DrinkService {

    //userò entrambe le injections solo a scopo dimostrativo, di solito si usa ovunque solo una delle due;
    //di seguito, la field injection

    @Autowired //basta questo
    private DrinkRepository drinkRepo;


    //nel service solitamente vanno inclusi: getAll, getById, save, delete

    public List<Drink> getAllDrinks(){
        return this.drinkRepo.findAll();
    }

    public Drink saveDrink(Drink drink){
        return this.drinkRepo.save(drink);
    }

    public Drink getDrinkById(UUID id){
        return this.drinkRepo.findById(id).orElse(null);
        //orElse serve a farti ritornare null, nel caso la ricerca non vada a buon fine
    }

    public void deleteDrinkById (UUID id){
        this.drinkRepo.deleteById(id);
    }

    public List<Drink> getDrinkByName(String name){
        return this.drinkRepo.findByName(name);
    }
}
