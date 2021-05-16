package com.company.Command;

public class TurnOff implements Command{
    private final ElectronicDevice electronicDevice;

    public TurnOff(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        this.electronicDevice.off();
    }

    @Override
    public void undo() {
        this.electronicDevice.on();
    }
}
