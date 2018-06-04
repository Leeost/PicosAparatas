package PizzaMaker.PizzaRecipes;

import PizzaMaker.Pizza;
import PizzaMaker.PizzaRecipe;
import PizzaMaker.Products;

public class PizzaVegetariana extends Pizza {

    public PizzaVegetariana() {
        super(new PizzaRecipe(), 0);
        super.getRecipe().setPizzaSize(20);
        super.getRecipe().setPizzaName("Vegetariana");
        super.getRecipe().setProducts(new Products(20, 19, 20, 0, 4));
    }

    @Override
    public String getPizzaName() {
        return getRecipe().getPizzaName();
    }
}
