package com.shaw.two.Bridge;

public class BlackCircle implements DrawApi{
    @Override
    public void draw(String radius,String x,String y) {
        System.out.println("Drawing Circle[ color: black, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
