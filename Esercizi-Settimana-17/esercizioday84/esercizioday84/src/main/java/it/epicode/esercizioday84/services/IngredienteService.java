package it.epicode.esercizioday84.services;

import it.epicode.esercizioday84.entities.Ingrediente;
import it.epicode.esercizioday84.repositories.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepository ingredientsRepo;

    public List<Ingrediente> getAllIngredients(){
        return this.ingredientsRepo.findAll();
    }

    public Ingrediente getIngredientById(UUID id){
        return this.ingredientsRepo.findById(id).orElse(null);
    }

    public Ingrediente saveIngredient(Ingrediente ingrediente){
        return this.ingredientsRepo.save(ingrediente);
    }

    public void deleteIngredientById (UUID id){
        this.ingredientsRepo.deleteById(id);
    }
}
