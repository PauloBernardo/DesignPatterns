package com.company.Command;

public class VolumeDown implements Command{
    private final ElectronicDevice electronicDevice;

    public VolumeDown(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() throws Exception {
        this.electronicDevice.volumeDown();
    }

    @Override
    public void undo() throws Exception {
        this.electronicDevice.volumeUp();
    }
}
