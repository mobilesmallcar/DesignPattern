package com.shaw.Build;

public class ComputerTest {
    public static void main(String[] args){
        Computer computer = new Computer
                .Builder("cpu","ram")
                .setKeyboard("keyboard")
                .build();
        System.out.println(computer);

    }
}
