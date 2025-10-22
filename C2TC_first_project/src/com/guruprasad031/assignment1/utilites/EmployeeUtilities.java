package com.guruprasad031.assignment1.utilites;

import com.guruprasad031.assignment1.employees.Employee;
import com.guruprasad031.assignment1.employees.Manager;

/**
 * Utility methods for working with {@link Employee} and related types.
 * All methods are public static to make them easily reusable without
 * requiring instantiation of this class.
 * 
 */
public class EmployeeUtilities {
    /**
     * Prints the common details of any employee to the standard output.
     *
     * employee the employee whose details should be printed; must not be null
     */
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }
    
    /**
     * Prints manager-specific details to the standard output.
     *
     * @param manager the manager whose department should be printed; must not be null
     */
    public static void printManagerDetails(Manager manager) {
        System.out.println("Department: " + manager.getDepartment());
    }
}
