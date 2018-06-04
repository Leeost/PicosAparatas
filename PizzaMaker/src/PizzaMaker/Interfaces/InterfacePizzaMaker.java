package PizzaMaker.Interfaces;

import PizzaMaker.Pizza;
import PizzaMaker.Products;

public interface InterfacePizzaMaker {
   public Pizza makePizza(String pizzaName, int pizzaSize);

   public void refillProducts(Products products);
}
