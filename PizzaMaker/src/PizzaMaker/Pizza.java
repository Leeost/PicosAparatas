package PizzaMaker;

import PizzaMaker.Interfaces.Recipes;

public abstract class Pizza {

    private Recipes pizzaRecipe;
    private int pizzaSize;

    public Pizza(Recipes pizzaRecipe, int pizzaSize) {
        this.pizzaRecipe = pizzaRecipe;
        this.pizzaSize = pizzaSize;
    }

    public Recipes getRecipe() {
        return pizzaRecipe;
    }

    public int getSize() {
        return pizzaSize;
    }

    public abstract String getPizzaName();

}
