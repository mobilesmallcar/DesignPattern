package com.shaw.Build.actualCombat;

public class ComputerDirector {
    public void makeComputer(ComputerBuilder builder){
        builder.setUsbCount();
        builder.setKeyboard();
        builder.setDisplay();
    }
}
