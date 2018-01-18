package com.company.model;

import com.company.enums.Addition;
import com.company.enums.BreadRollType;
import com.company.enums.MeatType;

public class HealthyBurger extends Hamburger{

    public HealthyBurger(MeatType meatType) {

        additions = new Addition[4];

        setBreadRollType(BreadRollType.BROWN_RYE);
        setMeatType(meatType);
        calculatePrice();
    }

}
