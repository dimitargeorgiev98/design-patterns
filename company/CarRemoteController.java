package com.company;

public class CarRemoteController {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressRemoteButton() {
        System.out.println("Button pressed..");
        this.command.execute();
    }

}
