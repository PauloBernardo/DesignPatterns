package com.company.Brigde;

public class RadioRemote extends RemoteButton {

    public RadioRemote(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("Radio is paused");
    }
}
