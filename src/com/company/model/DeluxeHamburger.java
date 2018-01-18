package com.company.model;

import com.company.enums.Addition;
import com.company.enums.BreadRollType;
import com.company.enums.MeatType;

public class DeluxeHamburger extends Hamburger{

    public DeluxeHamburger(BreadRollType breadRollType, MeatType meatType) {

        setBreadRollType(breadRollType);
        setMeatType(meatType);

        additions = new Addition[2];
        additions[0] = Addition.CHIPS;
        additions[1] = Addition.DRINK;

        calculatePrice();
    }


    @Override
    public void setAdditions(Addition[] additions) {

    }
}
