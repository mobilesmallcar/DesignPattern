package com.shaw.AbstractFactory;

import com.shaw.AbstractFactory.Color.Color;
import com.shaw.AbstractFactory.Color.ColorFactory;
import com.shaw.AbstractFactory.shape.ShapeFactory;

public class FactoryProducer {
    private AbstractFactory abstractFactory;
    public FactoryProducer(String factory){
        switch(factory){
            case "color":
                abstractFactory = new ColorFactory();
                break;
            case "shape":
                abstractFactory = new ShapeFactory();
                break;
            default:
                throw new RuntimeException("功能待开发");
        }
    }

    public AbstractFactory getAbstractFactory() {
        return abstractFactory;
    }

    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }
}
