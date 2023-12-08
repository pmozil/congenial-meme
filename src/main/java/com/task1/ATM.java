package com.task1;

public class ATM {
    private Tray firstTray;

    public ATM(){
        firstTray = new Tray500().setNext(new Tray200().setNext(new Tray5()));
    }

    public void process(int amount){
        firstTray.process(amount);
    }
}
