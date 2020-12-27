/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.domain.Employee;

/**
 *
 * @author khalid
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee emp = new Employee();
       emp.setEmpId(101);
       emp.setName("Jane Smith");
       emp.setSnn("123-333-44");
       emp.setSalary(120_321.23);
       

       Employee man = new Employee();
       man.setEmpId(207);
       man.setName("Barbara Johnson");
       man.setSnn("111-333-44");
       man.setSalary(109_321.23);
       man.setDeptName("US Marketing");
       
       Employee admin = new Employee();
       admin.setEmpId(307);
       admin.setName("Bill Munroe");
       admin.setSnn("155-333-44");
       admin.setSalary(10_321.23);
       
       Employee dir = new Employee();
       dir.setEmpId(12);
       dir.setName("Susan Wheeler");
       dir.setSnn("111-333-44");
       dir.setSalary(199_321.23);
       dir.setDeptName("Global Markteing");
       dir.setBudget(1_000_000.00);
       

        System.out.println("Enginer");
        System.out.println("Employee id:     " + emp.getEmpId());
        System.out.println("Employee name:   " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSnn());
        System.out.println("Employee salary:   " + emp.getSalary());
        
        System.out.println("\n");
        System.out.println("Manger");
        System.out.println("Employee id:     " + man.getEmpId());
        System.out.println("Employee name:   " + man.getName());
        System.out.println("Employee Soc Sec #: " + man.getSnn());
        System.out.println("Employee salary:   " + man.getSalary());
        System.out.println("Employee DeptName:   " + man.getDeptName());

        
        System.out.println("\n");
        System.out.println("Admin");
        System.out.println("Employee id:     " + admin.getEmpId());
        System.out.println("Employee name:   " + admin.getName());
        System.out.println("Employee Soc Sec #: " + admin.getSnn());
        System.out.println("Employee salary:   " + admin.getSalary());
        
        System.out.println("\n");
        System.out.println("Director");
        System.out.println("Employee id:     " + dir.getEmpId());
        System.out.println("Employee name:   " + dir.getName());
        System.out.println("Employee Soc Sec #: " + dir.getSnn());
        System.out.println("Employee salary:   " + dir.getSalary());
        System.out.println("Employee DeptName:   " + dir.getDeptName());
        System.out.println("Employee Budget:   " + dir.getBudget());


    }
    
}
