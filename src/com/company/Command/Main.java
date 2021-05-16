package com.company.Command;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Command");

        ElectronicDevice television = new Television();
        ElectronicDevice radio = new Radio();

        // Using pure commands
        System.out.println("Pure commands \n");

        Command turnOnTV = new TurnOn(television);
        Command turnOnRadio = new TurnOn(radio);

        Command turnOffTV = new TurnOff(television);
        Command turnOffRadio = new TurnOff(radio);

        Command volumeUpTV = new VolumeUp(television);
        Command volumeUpRadio = new VolumeUp(radio);

        Command volumeDownTV = new VolumeDown(television);
        Command volumeDownRadio = new VolumeDown(radio);


        try {
            turnOnTV.execute();
            turnOnRadio.execute();
            volumeUpTV.execute();
            volumeUpTV.execute();
            volumeDownTV.execute();
            volumeDownTV.execute();
            volumeUpRadio.execute();
            volumeUpRadio.execute();
            volumeDownRadio.execute();
            volumeDownRadio.execute();
            turnOffTV.execute();
            turnOffRadio.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // Using control to execute commands
        System.out.println("\nControlled commands \n");

        ElectronicControl TVControl = new ElectronicControl(television);
        ElectronicControl RadioControl = new ElectronicControl(radio);


        TVControl.onPressPowerOn();
        TVControl.onPressVolumeUp();
        TVControl.onPressVolumeUp();
        TVControl.onPressVolumeDown();
        TVControl.onPressVolumeDown();
        RadioControl.onPressPowerOn();
        RadioControl.onPressVolumeUp();
        RadioControl.onPressVolumeUp();
        RadioControl.onPressVolumeDown();
        RadioControl.onPressVolumeDown();
        TVControl.onPressPowerOff();
        RadioControl.onPressPowerOff();

        // Using commandsPool to execute commands
        System.out.println("\nCommands Pool \n");

        CommandsPool commandsPool = new CommandsPool();

        commandsPool.addCommand(turnOnTV);
        commandsPool.addCommand(volumeUpTV);
        commandsPool.addCommand(volumeUpTV);
        commandsPool.addCommand(turnOnRadio);
        commandsPool.addCommand(volumeUpRadio);
        commandsPool.addCommand(volumeUpRadio);

        try {
            commandsPool.executeAllCommands();
            commandsPool.undoAllCommands();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
