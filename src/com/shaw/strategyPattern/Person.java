package com.shaw.strategyPattern;


import java.math.BigDecimal;

public class Person {
    private String name;
    private Integer age;
    private BigDecimal totalWeight;
    private BigDecimal applyWeight;
    private BigDecimal actualWeight;

    public Person() {
    }

    public Person(String name, Integer age, BigDecimal totalWeight, BigDecimal applyWeight, BigDecimal actualWeight) {
        this.name = name;
        this.age = age;
        this.totalWeight = totalWeight;
        this.applyWeight = applyWeight;
        this.actualWeight = actualWeight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", totalWeight=" + totalWeight +
                ", applyWeight=" + applyWeight +
                ", actualWeight=" + actualWeight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public BigDecimal getApplyWeight() {
        return applyWeight;
    }

    public void setApplyWeight(BigDecimal applyWeight) {
        this.applyWeight = applyWeight;
    }

    public BigDecimal getActualWeight() {
        return actualWeight;
    }

    public void setActualWeight(BigDecimal actualWeight) {
        this.actualWeight = actualWeight;
    }
}
