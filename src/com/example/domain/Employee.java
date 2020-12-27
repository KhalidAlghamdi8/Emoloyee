/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

/**
 *
 * @author khalid
 */

public class Employee {

    
    private int empId;
    private String name;
    private String snn;
    private double salary;
    private String deptName;
    private double budget;

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    static String printEmployee (String Employee) {
        System.out.println(Employee);
        return Employee;            
}

    
    
    
    class Manager {

    private String deptName;

        
        class Director {
            private double budget;
            private String deptName;

            public double getBudget() {
                return budget;
            }

            public String getDeptName() {
                return deptName;
            }

            public int getEmpId() {
                return empId;
            }

            public String getName() {
                return name;
            }

            public String getSnn() {
                return snn;
            }

            public double getSalary() {
                return salary;
            }
        }
    }

    class Engineer {

    }

    class Admin {

    }
    public int getEmpId() {
        return empId;
    }
    


    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSnn() {
        return snn;
    }

    public void setSnn(String snn) {
        this.snn = snn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

static double raiseSalary (double increase){
    return 0;
}



}


