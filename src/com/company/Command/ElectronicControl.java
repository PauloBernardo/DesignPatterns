package com.company.Command;

public class ElectronicControl {
    private final TurnOn turnOn;
    private final TurnOff turnOff;
    private final VolumeDown volumeDown;
    private final VolumeUp volumeUp;

    public ElectronicControl(ElectronicDevice electronicDevice) {
        this.turnOn = new TurnOn(electronicDevice);
        this.turnOff = new TurnOff(electronicDevice);
        this.volumeDown = new VolumeDown(electronicDevice);
        this.volumeUp = new VolumeUp(electronicDevice);
    }

    public void onPressPowerOn() {
        this.turnOn.execute();
    }

    public void onPressPowerOff() {
        this.turnOff.execute();
    }

    public void onPressVolumeUp() {
        try {
            this.volumeUp.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void onPressVolumeDown() {
        try {
            this.volumeDown.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
