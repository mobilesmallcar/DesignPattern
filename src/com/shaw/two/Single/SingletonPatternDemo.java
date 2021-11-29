package com.shaw.two.Single;

public class SingletonPatternDemo {
    public static void main(String[] args){
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
        SingleObject singleObject2 = SingleObject.getInstance();
        System.out.println(singleObject);
        System.out.println(singleObject2);
    }
}
