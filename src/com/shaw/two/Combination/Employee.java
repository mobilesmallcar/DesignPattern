package com.shaw.two.Combination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> employees;
    private List<String> list;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        employees = new ArrayList<Employee>();
    }
    public void add(Employee e){
        employees.add(e);
    }
    public void remove(Employee e){
        employees.remove(e);
    }
    public List<Employee> getEmployeeList(){
        return employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", employees=" + employees +
                ", list=" + list +
                '}';
    }
}
