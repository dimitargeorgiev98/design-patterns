package com.company;

public class ClassicEggBurger extends BurgerDecorator {

    public ClassicEggBurger(Burger decoratedBurger){
        super(decoratedBurger);
    }

    public void create(){
        decoratedBurger.create();
        setClassicEggBurger(decoratedBurger);
    }

    private void setClassicEggBurger(Burger decoratedBurger) {
        System.out.println("Egg added to the burger.");
    }

}
