package PizzaMaker.PizzaRecipes;

import PizzaMaker.Pizza;
import PizzaMaker.PizzaRecipe;
import PizzaMaker.Products;

public class PizzaPepperoni extends Pizza {


    public PizzaPepperoni() {
        super(new PizzaRecipe(), 0);
        super.getRecipe().setPizzaSize(20);
        super.getRecipe().setPizzaName("Pepperoni");
        super.getRecipe().setProducts(new Products(20, 19, 20, 4, 4));
    }

    @Override
    public String getPizzaName() {
        return getRecipe().getPizzaName();
    }
}
