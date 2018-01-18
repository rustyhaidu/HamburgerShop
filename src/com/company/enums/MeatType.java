package com.company.enums;

public enum MeatType {

    CHICKEN(2.5),
    PORK(2.7),
    COW(2.8);

    private final double price;

    MeatType(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
