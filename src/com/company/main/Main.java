package com.company.main;

import com.company.model.DeluxeHamburger;
import com.company.model.Hamburger;
import com.company.model.HealthyBurger;
import com.company.enums.Addition;
import com.company.enums.BreadRollType;
import com.company.enums.MeatType;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger(BreadRollType.BREADCAKE, MeatType.CHICKEN);

        System.out.println(hamburger.getPrice());
        hamburger.setAdditions(new Addition[]{Addition.LETTUCE, Addition.CARROT, Addition.KETCHUP, Addition.ONION_SOS});

        System.out.println(hamburger.getPrice());

        Hamburger healthyBurger = new HealthyBurger(MeatType.COW);
        healthyBurger.setAdditions(
                new Addition[]{Addition.LETTUCE,
                        Addition.CARROT,
                        Addition.KETCHUP,
                        Addition.ONION_SOS});

        System.out.println(healthyBurger.getPrice());

        Hamburger deluxeBurger = new DeluxeHamburger(BreadRollType.BUN, MeatType.PORK);

        System.out.println(deluxeBurger.getPrice());
    }
}
