package com.shaw.AbstractFactory;

import com.shaw.AbstractFactory.Color.Color;
import com.shaw.AbstractFactory.Color.ColorFactory;

public class AbstractFactoryTest {
    public static void main(String[] args){
        FactoryProducer producer = new FactoryProducer("color");
        Color color = producer.getAbstractFactory().fill("red");
        color.fill();
    }
}
