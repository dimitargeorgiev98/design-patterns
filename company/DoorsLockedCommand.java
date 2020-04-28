package com.company;

public class DoorsLockedCommand implements Command{

    private Doors doors;

    public  DoorsLockedCommand(Doors doors){
        this.doors = doors;
    }

    @Override
    public void execute() {
        this.doors.lock();
    }
}
