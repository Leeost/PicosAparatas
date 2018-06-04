package PizzaMaker.Interfaces;

import PizzaMaker.Products;

public interface Recipes {
   public Products getUsableProducts(int pizzaSize);
   public void setProducts (Products products);
   public void setPizzaSize(int pizzaSize);
   public void setPizzaName(String pizzaName);
   public String getPizzaName();

}
