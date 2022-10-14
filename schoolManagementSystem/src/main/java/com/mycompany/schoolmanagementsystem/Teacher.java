
package com.mycompany.schoolmanagementsystem;


public class Teacher {
    
    private int id;
    private String name;
    private int salary;
    
    
    public void createTeacher(int id, String name, int salary){ //constructor for a 
       this.id = id;                                     // teacher
       this.name= name;
       this.salary = salary;
        
    }
    
    public int getId(){ //getter
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getSalary(){
        return salary;
    }
    
    public void setSallary(int salary){  //setter
        this.salary = salary;
    }
    
    
}
