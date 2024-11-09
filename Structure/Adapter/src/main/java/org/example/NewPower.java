package org.example;

public class NewPower implements NewPowerSocket{
    @Override
    public void plugIn() {
        System.out.println("new power plug in");
    }
}
