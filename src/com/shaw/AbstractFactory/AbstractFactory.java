package com.shaw.AbstractFactory;

import com.shaw.AbstractFactory.Color.Color;
import com.shaw.AbstractFactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color fill(String color);
    public abstract Shape draw(String shape);
}
