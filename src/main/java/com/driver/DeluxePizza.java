package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(int basePrice) {
        super(basePrice);
        this.addExtraCheese();
        this.addExtraToppings();
    }

    @Override
    public String generateBill() {
        StringBuilder bill = new StringBuilder();
        bill.append(super.generateBill());
        bill.append("Total Price: ").append(getTotalPrice()).append("\n");
        return bill.toString();
    }

}
