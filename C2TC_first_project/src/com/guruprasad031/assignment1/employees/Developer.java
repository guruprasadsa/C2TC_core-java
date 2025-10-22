package com.guruprasad031.assignment1.employees;

/**
 * A concrete who writes code in a specific programming language.
 * <p>
 * Field visibility is private with public accessors to
 * preserve encapsulation.
 * </p>
 */
public class Developer extends Employee {
    private String programmingLanguage;
    
    /**
     * Gets the primary programming language used by this developer.
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    
    /**
     * Sets the primary programming language used by this developer.
     */
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
