package com.shaw.Build.actualCombat;

public abstract class ComputerBuilder {
    protected Computer computer;
    public ComputerBuilder(String cpu,String ram) {
        computer = new Computer(cpu,ram);
    }

    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    public Computer getComputer(){
        return this.computer;
    }
}
