package com.company.enums;

public enum Addition {

    LETTUCE(1.5),
    TOMATO(2),
    CARROT(1),
    PICKELS(1.2),
    KETCHUP(0.5),
    ONION_SOS(0.6),
    CHIPS(3),
    DRINK(4);

    private final double price;

    Addition(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

}
