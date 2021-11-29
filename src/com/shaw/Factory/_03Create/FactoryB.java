package com.shaw.Factory._03Create;

public class FactoryB extends Factory{
    @Override
    Product manufacture(){
        return new Goods.ProductB();
    }
}
