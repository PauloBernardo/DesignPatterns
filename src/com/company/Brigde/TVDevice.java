package com.company.Brigde;

public class TVDevice extends EntertainmentDevice {

    public TVDevice(int deviceState, int maxSettings) {
        this.deviceState = deviceState;
        this.maxSetting = maxSettings;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Channel down");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Channel up");
        deviceState++;
    }
}
