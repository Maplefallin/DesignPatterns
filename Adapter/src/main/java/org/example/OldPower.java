package org.example;

public class OldPower implements OldPowerSocket {

    public OldPower() {}

    @Override
    public void connection(){
        System.out.println("connected to old power!");
    }
}
