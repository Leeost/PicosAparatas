package PizzaMaker;

import PizzaMaker.Interfaces.InterfacePizzaMaker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("My Pizza Maker v.0.0.1");
        System.out.println(" ");
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
        System.out.println("");

        InterfacePizzaMaker pizzaMaker = new PizzaMaker(new Products(pizzaPad, cheese,pizzaSauce,sausage,tomatoes));

        boolean turnOn = true;
        do {
            System.out.println("Enter pizza type: Margherita, Pepperoni or Vegetariana");
            System.out.println("");


            Scanner screenInput = new Scanner(System.in);
            String pizzaNameInput = screenInput.next();
            System.out.println("");
            System.out.println("Enter pizza size: 20, 30 or 40 cm");
            int pizzaSizeInput = pizzaMakerInput.nextInt();

            pizzaMaker.makePizza(pizzaNameInput, pizzaSizeInput);
            System.out.println("");

            System.out.println("");


        }
        while (turnOn);
    }

}


