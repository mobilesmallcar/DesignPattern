package com.shaw.two.Combination;

public class EmployeeTest {
    public static void main(String[] args){
        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);
        for(Employee headEmployee: CEO.getEmployeeList()){
            System.out.println(headEmployee);
            System.out.println("------------------");
            for(Employee employee: headEmployee.getEmployeeList()){
                System.out.println(employee);
            }
            System.out.println("------END");
        }
    }
}
