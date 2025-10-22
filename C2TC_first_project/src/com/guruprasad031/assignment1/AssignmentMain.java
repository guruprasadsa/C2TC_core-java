package com.guruprasad031.assignment1;
import com.guruprasad031.assignment1.employees.Developer;
import com.guruprasad031.assignment1.employees.Manager;
import com.guruprasad031.assignment1.utilites.EmployeeUtilities;

/**
 * Application entry point showcasing basic usage of the employee hierarchy.
 * This class is public so it can be invoked by the JVM from outside
 * its package. The main method is also public static as required
 * by the Java runtime.
 * 
 */
public class AssignmentMain {
    /**
     * Starts the demo program.
     */
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Alice");
        manager.setEmployeeId(1);
        manager.setSalary(50000);
        manager.setDepartment("HR");
        
        Developer developer = new Developer();
        developer.setName("Bob");
        developer.setEmployeeId(2);
        developer.setSalary(60000);
        developer.setProgrammingLanguage("Java");
        
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printManagerDetails(manager);
        
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
