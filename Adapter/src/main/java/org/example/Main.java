package org.example;

public class Main {
    public static void main(String[] args) {

        OldPowerSocket oldPowerSocket = new OldPower();

        NewPowerSocket newPowerAdapter = new NewPowerAdapter(oldPowerSocket);

        newPowerAdapter.plugIn();
    }
}