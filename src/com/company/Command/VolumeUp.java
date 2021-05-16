package com.company.Command;

public class VolumeUp implements Command{
    private final ElectronicDevice electronicDevice;

    public VolumeUp(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() throws Exception {
        this.electronicDevice.volumeUp();
    }

    @Override
    public void undo() throws Exception {
        this.electronicDevice.volumeDown();
    }
}
