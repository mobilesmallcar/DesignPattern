package com.shaw.two.Bridge;

public class RedCircle implements DrawApi{
    @Override
    public void draw(String radius,String x,String y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
