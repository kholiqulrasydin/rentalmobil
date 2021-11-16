package com.kelompok3.rentcar.services;

public class RunState {
    boolean isRun = true;

    public void changeState(){
        this.isRun = !isRun;
    }

    public boolean getState(){
        return this.isRun;
    }
    
}
