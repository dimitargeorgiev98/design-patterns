package com.company;

public class DecoratorMain {

    public static void main(String[] args) {

    BurgerFacade burgerFacade = new BurgerFacade();
    burgerFacade.createClassicEggBurger();
    burgerFacade.createClassicCheeseBurger();
    burgerFacade.createClassicBurger();

    }
}
