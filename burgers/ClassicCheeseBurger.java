package com.company;

public class ClassicCheeseBurger extends BurgerDecorator {

    public ClassicCheeseBurger(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    public void create() {
        decoratedBurger.create();
        setClassicCheeseBurger(decoratedBurger);
    }

    private void setClassicCheeseBurger(Burger decoratedBurger){
        System.out.println("Cheese added to the burger.");
    }

}
