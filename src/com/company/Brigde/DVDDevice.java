package com.company.Brigde;

public class DVDDevice extends EntertainmentDevice {

    public DVDDevice(int deviceState, int maxSettings) {
        this.deviceState = deviceState;
        this.maxSetting = maxSettings;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("DVD skips to chapter");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("DVD skips to new chapter");
        deviceState++;
    }
}
