package structural.bridge.example2;

import structural.bridge.example2.abstractions.AmericanRestaurant;
import structural.bridge.example2.abstractions.ItalianRestaurant;
import structural.bridge.example2.abstractions.Restaurant;
import structural.bridge.example2.implementations.PepperoniPizza;
import structural.bridge.example2.implementations.VeggiePizza;

public class Client {

    /*
     * Video Reference: https://youtu.be/88kAIisOiYs
     */
    public static void main(String[] args) {
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
    }

}
