package com.company;

public class Doors {
    private Boolean doorsLocked;

    public void lock(){
        System.out.println("Doors are locked!");
        this.doorsLocked = true;
    }

    public void unlock(){
        System.out.println("Doors are unlocked!");
        this.doorsLocked = false;
    }

}
