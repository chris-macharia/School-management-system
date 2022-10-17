/*This class is responsible for keeping track of students fees, name, grade and
fees paid
 */
package com.mycompany.schoolmanagementsystem;



public class Student {
    
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;
    
    /**
     * to create a new student by initializing
     * @param id for student id: Unique 
     * @param name for student name
     * @param grade for grade of the student
     * fees for every student is 40,000
     * initial fees for all students is 0
     */
    public void createStudent(int id, String name, int grade){
        
        totalFees = 40000;
        feesPaid = 0;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    
 
    public void setGrade(int grade){ // setter for student grade
        this.grade = grade;
    }
    
    public void updateFees(int fees){
        feesPaid = feesPaid + fees;
        School.updateMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getTotalFees() {
        return totalFees;
    }
    
    
}
