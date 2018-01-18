package com.company.model;

import com.company.enums.Addition;
import com.company.enums.BreadRollType;
import com.company.enums.MeatType;

public class Hamburger {

    private BreadRollType breadRollType;
    private MeatType meatType;
    private double price;

    protected Addition[] additions;

    public Hamburger(BreadRollType breadRollType, MeatType meatType) {

        additions = new Addition[4];

        this.breadRollType = breadRollType;
        this.meatType = meatType;
        calculatePrice();
    }

    protected Hamburger(MeatType meatType){
        this.meatType = meatType;
    }

    protected Hamburger(){

    }



    protected void calculatePrice() {
        price = this.breadRollType.getPrice() + this.meatType.getPrice();
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(BreadRollType breadRollType) {
        this.breadRollType = breadRollType;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }

    public double getPrice() {
        return price;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    public void setAdditions(Addition[] additions) {

        if (this.additions.length == 0) {
            this.additions = additions;
        } else {
            calculatePrice();

        }

        for (int i = 0; i < additions.length; i++) {
            if (!(additions[i] == null)){
                price = price + additions[i].getPrice();
            }
        }


    }
}
