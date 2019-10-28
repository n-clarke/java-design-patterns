package com.pattern.creational.prototype;

import java.util.ArrayList;

public class Employee {

    private ArrayList<String> empList;

    public Employee(){
        empList = new ArrayList<String>();
    }

    public Employee(ArrayList<String> list){
        this.empList = list;
    }

    public void loadData(String[] list){
        for(String s: list)
        {
            empList.add(s);
        }
    }

    public ArrayList<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        ArrayList<String> temp = new ArrayList<String>();
        for(String in : this.getEmpList()){
            temp.add(in);
        }
        return new Employee(temp);
    }
}
