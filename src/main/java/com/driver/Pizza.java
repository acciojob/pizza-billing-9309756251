package com.driver;

public class Pizza {

    protected int basePrice;
    protected boolean extraCheeseAdded;
    protected boolean extraToppingsAdded;

    public Pizza(int basePrice) {
        this.basePrice = basePrice;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            this.basePrice += 80;
            this.extraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            this.basePrice += 70;
            this.extraToppingsAdded = true;
        }
    }

    public int getTotalPrice() {
        return basePrice;
    }

    public String generateBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
        if (extraCheeseAdded) {
            bill.append("Extra Cheese Added: ").append(80).append("\n");
        }
        if (extraToppingsAdded) {
            bill.append("Extra Toppings Added: ").append(70).append("\n");
        }
        return bill.toString();
    }
}
