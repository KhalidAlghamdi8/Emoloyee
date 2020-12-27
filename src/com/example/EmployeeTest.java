/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.domain.Employee;

/**
 *
 * @author khali
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee emp = new Employee();

       
       
        System.out.println("Employee id:     " + emp.getEmpId());
        System.err.println("Employee name:   " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSnn());
        System.out.println("Employee salary:   " + emp.getSalary());
        
    }
    
}
