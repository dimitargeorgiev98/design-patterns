package com.company;

public class BurgerFacade {

    private Burger classic;
    private Burger cheeseBurger;
    private Burger eggBurger;

    public BurgerFacade(){

        this.classic = new ClassicBurger();
        this.cheeseBurger = new ClassicCheeseBurger(new ClassicBurger());
        this.eggBurger = new ClassicEggBurger(new ClassicBurger());
    }

    public void createClassicBurger() {

        classic.create();
    }

    public void createClassicCheeseBurger() {

        cheeseBurger.create();
    }

    public void createClassicEggBurger() {

        eggBurger.create();
    }

}
