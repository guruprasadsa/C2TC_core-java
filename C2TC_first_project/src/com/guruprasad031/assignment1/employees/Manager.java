package com.guruprasad031.assignment1.employees;

/**
 * A specialized Employee who oversees a department.
 * The additional field is kept private and accessed via
 * public getter/setter to maintain encapsulation.
 * 
 */
public class Manager extends Employee {
    private String department;
    
    /**
     * Returns the department this manager is responsible for.
     *
     */
    public String getDepartment() {
        return department;
    }
    
    /**
     * Sets the department this manager is responsible for.
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}
