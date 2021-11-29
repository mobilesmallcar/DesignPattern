package com.shaw.AbstractFactory.shape;

import com.shaw.AbstractFactory.AbstractFactory;
import com.shaw.AbstractFactory.Color.Color;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color fill(String color) {
        return null;
    }

    @Override
    public Shape draw(String shape) {
        //todo
        return null;
    }
}
