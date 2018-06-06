package PizzaMaker;


import PizzaMaker.Interfaces.InterfacePizzaMaker;
import PizzaMaker.PizzaRecipes.PizzaMargherita;
import PizzaMaker.PizzaRecipes.PizzaPepperoni;
import PizzaMaker.PizzaRecipes.PizzaVegetariana;

public class PizzaMaker implements InterfacePizzaMaker {

    private Products products;
    private int usesCount;

    public PizzaMaker(Products products) {
        this.products = products;
    }


    @Override
    public Pizza makePizza(String pizzaName, int pizzaSize) {
        Pizza pizza = null;

        if (pizzaSize == 20 || pizzaSize == 30 || pizzaSize == 40) {
            switch (pizzaName) {
                case "margherita":
                    pizza = new PizzaMargherita();
                    break;
                case "pepperoni":
                    pizza = new PizzaPepperoni();
                    break;
                case "vegetariana":
                    pizza = new PizzaVegetariana();
                    break;
                default:
                    System.out.println("Wrong type of pizza!");
                    break;
            }
        } else {
            System.out.println("Wrong pizza size!");
            return pizza = null;
        }
        if (this.products.checkProductsIfEnough(pizza.getRecipe().getUsableProducts(pizzaSize)) == false) {
            System.out.println(getProducts());

            refillProducts();

            return pizza = null;


        } else if (pizza != null) {
            this.products.substractProducts(pizza.getRecipe().getUsableProducts(pizzaSize));

            System.out.println("Pizza " + pizza.getPizzaName() + " is ready!");

            rewashPizzaMaker();


        }
        return pizza;
    }


    public void refillProducts() {
        this.products.addProducts();
        System.out.println("Products were refilled!");

    }

    private Products getProducts() {
        return products;
    }

    private void rewashPizzaMaker() {
        usesCount++;
        if (usesCount == 20) {
            System.out.println("Pizza Maker was rewashed!");
            this.usesCount = 0;
        }
    }
}
