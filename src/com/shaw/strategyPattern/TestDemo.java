package com.shaw.strategyPattern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public static void main(String[] args){
        Person p1 = new Person("shaw",18,null,new BigDecimal(3),new BigDecimal(1));
        Person p2 = new Person("shaw",18,null,new BigDecimal(4),new BigDecimal(1));
        Person p3 = new Person("shaw",18,null,new BigDecimal(3),new BigDecimal(3));
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.forEach(s->{
//            BigDecimal todoWeight = s.getApplyWeight().subtract(s.getActualWeight());
            s.setApplyWeight(s.getApplyWeight().subtract(s.getActualWeight()));
        });
//        for (Person person : personList) {
//            BigDecimal todoWeight = person.getApplyWeight().subtract(person.getActualWeight());
//            System.out.println(todoWeight);
//            person.setApplyWeight(todoWeight);
//        }
//        System.out.println(personList.forEach());
        personList.forEach(s->{
            BigDecimal applyWeight = s.getApplyWeight();
            System.out.println(applyWeight);
        });
    }
}
