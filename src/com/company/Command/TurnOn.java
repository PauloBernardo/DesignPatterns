package com.company.Command;

public class TurnOn implements Command{
    private final ElectronicDevice electronicDevice;

    public TurnOn(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        this.electronicDevice.on();
    }

    @Override
    public void undo() {
        this.electronicDevice.off();
    }
}
