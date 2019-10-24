package com.pattern.creational.prototype;

import java.util.ArrayList;

public class MainPrototype {

    static Employee employees = new Employee();

    public static void main(String[] args) throws CloneNotSupportedException {
        String[] listEmployees = {"John Snow", "Mark Snowman", "John Button", "Lisa Simpson"};
        employees.loadData(listEmployees);

        //Gets the Employee object using the clone method
        Employee employeesNew = (Employee) employees.clone();
        Employee employeesNew1 = (Employee) employees.clone();
        System.out.println("emps List: " + employees.getEmpList());

        ArrayList<String> list0 = employeesNew.getEmpList();
        list0.add("Sarah Green");
        System.out.println("empsNew List: " + list0);

        ArrayList<String> list1 = employeesNew1.getEmpList();
        list1.remove("Mark Snowman");
        System.out.println("empsNew1 List: " + list1);
    }
}
