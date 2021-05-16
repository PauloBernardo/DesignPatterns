package com.company.Command;

public class Radio implements ElectronicDevice{
    private String state;
    private int volume;

    @Override
    public void on() {
        this.state = "On";
        System.out.println("Radio is on now.");
    }

    @Override
    public void off() {
        this.state = "Off";
        System.out.println("Radio is off now.");
    }

    @Override
    public void volumeUp() throws Exception {
        if(this.state.equals("On")) {
            this.volume++;
            System.out.println("Volume is at: " + this.volume);
        } else {
            throw new Exception("Television is off");
        }
    }

    @Override
    public void volumeDown() throws Exception {
        if(this.state.equals("On")) {
            this.volume--;
            System.out.println("Volume is at: " + this.volume);
        } else {
            throw new Exception("Television is off");
        }
    }

    public String getState() {
        return this.state;
    }
}
