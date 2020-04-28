package com.company;

public class Main {

    public static void main(String[] args) {

        CarRemoteController carRemoteController = new CarRemoteController();
        Doors doors = new Doors();
        Command doorsUnlockedCommand = new DoorsUnlockedCommand(doors);
        Command doorsLockedCommand = new DoorsLockedCommand(doors);

        carRemoteController.setCommand(doorsUnlockedCommand);
        carRemoteController.pressRemoteButton();

        carRemoteController.setCommand(doorsLockedCommand);
        carRemoteController.pressRemoteButton();
    }
}
