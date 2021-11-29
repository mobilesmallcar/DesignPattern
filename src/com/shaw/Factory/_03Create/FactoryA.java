package com.shaw.Factory._03Create;

public class FactoryA extends Factory{
    @Override
    Product manufacture(){
        return new Goods.ProductA();
    }
}
