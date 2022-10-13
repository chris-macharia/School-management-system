
package com.mycompany.schoolmanagementsystem;


public class Teachers {
    
    private int id;
    private String name;
    private int salary;
    
    
    public void teacher(int id, String name, int salary){
       this.id = id;
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
