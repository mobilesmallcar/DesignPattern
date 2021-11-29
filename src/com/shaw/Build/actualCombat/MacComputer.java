package com.shaw.Build.actualCombat;

public class MacComputer extends ComputerBuilder{
    public MacComputer(String cpu, String ram) {
        super(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("苹果键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("苹果显示器");
    }

}
