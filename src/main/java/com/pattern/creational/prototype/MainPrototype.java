package com.pattern.creational.prototype;

public class MainPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        //Create an Employee object and adding employee data.
        Employee employees = new Employee();
        String[] listEmployees = {"John Snow", "Mark Snowman", "John Button", "Lisa Simpson"};
        employees.loadData(listEmployees);

        //Gets the Employee object using the clone method.
        Employee employeesNew = (Employee) employees.clone();
        Employee employeesNew1 = (Employee) employees.clone();

        //Making changes to the cloned objects.
        employeesNew.getEmpList().add("Sarah Green");
        employeesNew1.getEmpList().remove("Mark Snowman");

        //Displaying Results.
        System.out.println("employees List: " + employees.getEmpList());
        System.out.println("employeesNew List: " + employeesNew.getEmpList());
        System.out.println("employeesNew1 List: " + employeesNew1.getEmpList());
    }
}
