package com.company.Brigde;

public class RadioDevice extends EntertainmentDevice {

    public RadioDevice(int deviceState, int maxSettings) {
        this.deviceState = deviceState;
        this.maxSetting = maxSettings;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Radio station down");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Radio station up");
        deviceState++;
    }
}
