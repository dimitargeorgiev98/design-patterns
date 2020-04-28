package com.company;

public class DoorsUnlockedCommand implements Command{

    @Override
    public void execute() {
        this.doors.unlock();
    }

    private Doors doors;

    public DoorsUnlockedCommand(Doors doors){
        this.doors = doors;
    }
}
