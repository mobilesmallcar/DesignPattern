package com.shaw.Build.actualCombat;

public class LenovoComputer extends ComputerBuilder{
    public LenovoComputer(String cpu, String ram) {
        super(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(0);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("联想键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("联想显示器");
    }

}
