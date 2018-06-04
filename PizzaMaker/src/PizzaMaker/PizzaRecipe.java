package PizzaMaker;


import PizzaMaker.Interfaces.Recipes;

public class PizzaRecipe implements Recipes {

    private Products recipeProducts;
    private int pizzaSize;
    private String pizzaName;


    @Override
    public Products getUsableProducts(int pizzaSize) {
        if (recipeProducts == null || pizzaSize == 0 || pizzaName == null) {
            System.out.println("Error");
            return null;
        } else if (pizzaSize == 20) {
            return recipeProducts;
        } else if (pizzaSize == 30) {
            recipeProducts.setPizzaPad(recipeProducts.getPizzaPad() * 1.5);
            recipeProducts.setCheese(recipeProducts.getCheese() * 1.5);
            recipeProducts.setPizzaSauce(recipeProducts.getPizzaSauce() * 1.5);
            recipeProducts.setSausage(recipeProducts.getSausage() * 1.5);
            recipeProducts.setTomatoes(recipeProducts.getTomatoes() * 1.5);
            return recipeProducts;
        } else if (pizzaSize == 40) {
            recipeProducts.setPizzaPad(recipeProducts.getPizzaPad() * 2);
            recipeProducts.setCheese(recipeProducts.getCheese() * 2);
            recipeProducts.setPizzaSauce(recipeProducts.getPizzaSauce() * 2);
            recipeProducts.setSausage(recipeProducts.getSausage() * 2);
            recipeProducts.setTomatoes(recipeProducts.getTomatoes() * 2);
            return recipeProducts;
        }

        return null;
    }

    @Override
    public void setProducts(Products products) {
        this.recipeProducts = products;
    }


    @Override
    public void setPizzaSize(int pizzaSize) {
        this.pizzaSize = pizzaSize;


    }

    @Override
    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;

    }

    @Override
    public String getPizzaName() {
        return pizzaName;
    }
}
