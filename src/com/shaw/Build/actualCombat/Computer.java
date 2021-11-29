package com.shaw.Build.actualCombat;

import lombok.Data;

@Data
public class Computer {
    private String cpu;
    private String ram;
    private int usbCount;
    private String keyboard;
    private String display;

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
}
