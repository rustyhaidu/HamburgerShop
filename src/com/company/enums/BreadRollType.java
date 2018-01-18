package com.company.enums;

public enum BreadRollType {

    CRUSTY(3.5),
    BREADCAKE(3.1),
    BUN(2.5),
    BUTTERY(3),
    BROWN_RYE(3.6);

    private final double price;

    BreadRollType(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
