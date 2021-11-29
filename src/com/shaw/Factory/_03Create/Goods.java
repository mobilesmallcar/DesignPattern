package com.shaw.Factory._03Create;

public class Goods {
    static class ProductA extends Product{
        @Override
        void show() {
            System.out.println("生产出了A...");
        }
    }
    static class ProductB extends Product{
        @Override
        void show() {
            System.out.println("生产出了B...");
        }
    }
}
