package PizzaMaker;

import java.util.Scanner;

public class Products {
    private double pizzaPad;
    private double cheese;
    private double pizzaSauce;
    private double sausage;
    private double tomatoes;

    public Products(double pizzaPad, double cheese, double pizzaSauce, double sausage, double tomatoes) {
        this.pizzaPad = pizzaPad;
        this.cheese = cheese;
        this.pizzaSauce = pizzaSauce;
        this.sausage = sausage;
        this.tomatoes = tomatoes;
    }

    public void addProducts() {
        System.out.println("Add products to Pizza Maker");
        Scanner pizzaMakerInput = new Scanner(System.in);

        System.out.println("Pizza pads:");
        double pizzaPad = pizzaMakerInput.nextInt();

        System.out.println("Cheese:");
        double cheese = pizzaMakerInput.nextInt();

        System.out.println("Pizza sauce:");
        double pizzaSauce = pizzaMakerInput.nextInt();

        System.out.println("Sausages:");
        double sausage = pizzaMakerInput.nextInt();

        System.out.println("Tomatoes:");
        double tomatoes = pizzaMakerInput.nextInt();

        this.setPizzaPad(this.getPizzaPad() + pizzaPad);
        this.setCheese(this.getCheese() + cheese);
        this.setPizzaSauce(this.getPizzaSauce() + pizzaSauce);
        this.setSausage(this.getSausage() + sausage);
        this.setTomatoes(this.getTomatoes() + tomatoes);
    }

    public void substractProducts(Products another) {
        this.setPizzaPad(this.getPizzaPad() - another.getPizzaPad());
        this.setCheese(this.getCheese() - another.getCheese());
        this.setPizzaSauce(this.getPizzaSauce() - another.getPizzaSauce());
        this.setSausage(this.getSausage() - another.getSausage());
        this.setTomatoes(this.getTomatoes() - another.getTomatoes());
    }

    public boolean checkProductsIfEnough(Products another) {
        if (this.pizzaPad < another.getPizzaPad() ||
                this.cheese < another.getCheese() ||
                this.pizzaSauce < another.getPizzaSauce() ||
                this.sausage < another.getSausage() ||
                this.tomatoes < another.getTomatoes()) {
            System.out.println("Not enough products!");
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Products{" +
                "pizzaPad=" + pizzaPad +
                ", cheese=" + cheese +
                ", pizzaSauce=" + pizzaSauce +
                ", sausage=" + sausage +
                ", tomatoes=" + tomatoes +
                '}';
    }

    //GETTERS

    public double getPizzaPad() {
        return pizzaPad;
    }

    public double getCheese() {
        return cheese;
    }

    public double getPizzaSauce() {
        return pizzaSauce;
    }

    public double getSausage() {
        return sausage;
    }

    public double getTomatoes() {
        return tomatoes;
    }

    // SETTERS

    public void setPizzaPad(double pizzaPad) {
        this.pizzaPad = pizzaPad;
    }

    public void setCheese(double cheese) {
        this.cheese = cheese;
    }

    public void setPizzaSauce(double pizzaSauce) {
        this.pizzaSauce = pizzaSauce;
    }

    public void setSausage(double sausage) {
        this.sausage = sausage;
    }

    public void setTomatoes(double tomatoes) {
        this.tomatoes = tomatoes;
    }
}




