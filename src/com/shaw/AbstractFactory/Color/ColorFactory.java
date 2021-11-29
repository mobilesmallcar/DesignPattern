package com.shaw.AbstractFactory.Color;

import com.shaw.AbstractFactory.AbstractFactory;
import com.shaw.AbstractFactory.shape.Shape;

import java.util.Objects;

public class ColorFactory extends AbstractFactory {


    @Override
    public Shape draw(String shape) {
        return null;
    }
    @Override
    public Color fill(String color) {
        Color colorBean;
        switch(color.toLowerCase()){
            case "black":
                colorBean = new Black();
                break;
            case "blue":
                colorBean = new Blue();
                break;
            case "red":
                colorBean = new Red();
                break;
            default:
                colorBean = null;
                break;
        }
        return colorBean;
    }
}
