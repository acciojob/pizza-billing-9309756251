package com.driver;

public class Main {
  public static void main(String[] args) {
    System.out.println("Example 1:");
    Pizza vegPizza = new Pizza(300);
    vegPizza.addExtraCheese();
    vegPizza.addExtraToppings();
    vegPizza.generateBill();

    // Example 2
    System.out.println("Example 2:");
    DeluxePizza nonVegDeluxePizza = new DeluxePizza(400);
    nonVegDeluxePizza.addExtraCheese();
    nonVegDeluxePizza.addExtraToppings();
    nonVegDeluxePizza.generateBill();
  }
}