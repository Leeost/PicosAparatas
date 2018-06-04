package PizzaMaker.PizzaRecipes;

import PizzaMaker.Pizza;
import PizzaMaker.PizzaRecipe;
import PizzaMaker.Products;

public class PizzaMargherita extends Pizza {

    public PizzaMargherita() {
        super(new PizzaRecipe(), 0);
        super.getRecipe().setPizzaSize(20);
        super.getRecipe().setPizzaName("Margherita");
        super.getRecipe().setProducts(new Products(20, 19, 20, 0, 0));
    }

    @Override
    public String getPizzaName() {
        return getRecipe().getPizzaName();
    }

}


