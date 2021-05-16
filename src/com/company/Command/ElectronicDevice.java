package com.company.Command;

public interface ElectronicDevice {

    public void on();
    public void off();
    public void volumeUp() throws Exception;
    public void volumeDown() throws Exception;
}
