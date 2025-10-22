package com.guruprasad031.assignment1.employees;

/**
 * Represents a generic employee in the organization.
 * Demonstrates proper encapsulation by keeping fields private and
 * exposing controlled access via public getters and setters.
 */
public class Employee {
    private String name;
    private int employeeId;
    private double salary;
    
    // Getters and Setters
    /**
     * Retrieves the name of the employee.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the employee.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Retrieves the unique employee identifier.
     */
    public int getEmployeeId() {
        return employeeId;
    }
    
    /**
     * Assigns a unique identifier to the employee.
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    /**
     * Retrieves the salary of the employee.
     */
    public double getSalary() {
        return salary;
    }
    
    /**
     * Updates the salary of the employee.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
