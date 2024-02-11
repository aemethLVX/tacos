package tacos.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tacos.models.Ingredient;
import tacos.repositories.IngredientRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final IngredientRepository ingredientRepository;

    public DataLoader(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public void run(String... args) {
        ingredientRepository.save(new Ingredient("Flour Tortilla", Ingredient.Type.WRAP));
        ingredientRepository.save(new Ingredient("Corn Tortilla", Ingredient.Type.WRAP));
        ingredientRepository.save(new Ingredient("Ground Beef", Ingredient.Type.PROTEIN));
        ingredientRepository.save(new Ingredient("Carnitas", Ingredient.Type.PROTEIN));
        ingredientRepository.save(new Ingredient("Diced Tomatoes", Ingredient.Type.VEGGIES));
        ingredientRepository.save(new Ingredient("Cheddar", Ingredient.Type.CHEESE));
        ingredientRepository.save(new Ingredient("Salsa", Ingredient.Type.SAUCE));
        ingredientRepository.save(new Ingredient("Sour Cream", Ingredient.Type.SAUCE));
    }

}
