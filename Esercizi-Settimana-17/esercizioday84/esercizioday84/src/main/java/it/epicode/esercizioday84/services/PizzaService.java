package it.epicode.esercizioday84.services;

import it.epicode.esercizioday84.entities.Pizza;
import it.epicode.esercizioday84.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PizzaService {

    //userò entrambe le injections solo a scopo dimostrativo, di solito si usa ovunque solo una delle due
    //di seguito, la constuctor injection


    //in questo tipo di injection è fondamentale dichiarare la costante come final,
    // a cui segue l'autowired di un costruttore con la sintassi di un setter
    private final PizzaRepository pizzaRepo;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepo){
        this.pizzaRepo = pizzaRepo;
    }

    public List<Pizza> getAllPizzas(){
        return this.pizzaRepo.findAll();
    }

    public Pizza getPizzaById(UUID id){
        return this.pizzaRepo.findById(id).orElse(null);
    }

    public Pizza savePizza(Pizza pizza){
        return this.pizzaRepo.save(pizza);
    }

    public void deletePizzaById (UUID id){
        this.pizzaRepo.deleteById(id);
    }
}
