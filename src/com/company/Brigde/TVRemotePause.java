package com.company.Brigde;

public class TVRemotePause extends RemoteButton {
    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV is paused");
    }
}
