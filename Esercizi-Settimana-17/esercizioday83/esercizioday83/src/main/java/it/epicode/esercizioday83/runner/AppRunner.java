package it.epicode.esercizioday83.runner;

import it.epicode.esercizioday83.entities.Drink;
import it.epicode.esercizioday83.entities.Ingrediente;
import it.epicode.esercizioday83.entities.Pizza;
import it.epicode.esercizioday83.services.DrinkService;
import it.epicode.esercizioday83.services.IngredienteService;
import it.epicode.esercizioday83.services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private DrinkService drinkService;

    @Autowired
    private IngredienteService ingredienteService;

    @Autowired
    private PizzaService pizzaService;

    @Override //qui dentro ci scriviamo quello che di norma dovremmo scrivere nel Main
    public void run(String... args) throws Exception {

        Drink drink1 = new Drink();
        drink1.setMl(1000);
        drink1.setCalories(150);
        drink1.setName("Coca cola");
        drinkService.saveDrink(drink1);

        Pizza pizza1 = new Pizza();
        pizza1.setCalorie(1000);
        pizzaService.savePizza(pizza1);

        Ingrediente sugo = new Ingrediente();
        sugo.setNome("sugo");
        sugo.setPizza(pizza1);
        Ingrediente savedIngredient = ingredienteService.saveIngredient(sugo);

        System.out.println("Ingrediente registrato con successo! ingrediente: " + savedIngredient);
    }

}
