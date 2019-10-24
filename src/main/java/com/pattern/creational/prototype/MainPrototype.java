package com.pattern.creational.prototype;

import java.util.ArrayList;

public class MainPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employees = new Employee();
        String[] listEmployees = {"John Snow", "Mark Snowman", "John Button", "Lisa Simpson"};
        employees.loadData(listEmployees);

        //Gets the Employee object using the clone method
        Employee employeesNew = (Employee) employees.clone();
        Employee employeesNew1 = (Employee) employees.clone();

        ArrayList<String> list0 = employeesNew.getEmpList();
        list0.add("Sarah Green");

        ArrayList<String> list1 = employeesNew1.getEmpList();
        list1.remove("Mark Snowman");

        System.out.println("employees List: " + employees.getEmpList());
        System.out.println("employeesNew List: " + list0);
        System.out.println("employeesNew1 List: " + list1);
    }
}
