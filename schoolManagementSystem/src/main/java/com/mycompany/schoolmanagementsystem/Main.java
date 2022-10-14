package com.mycompany.schoolmanagementsystem;


public class Main {
    public static void main(String[] args) {
        Teacher Joel = new Teacher();
        Joel.createTeacher(1, "Joel", 70000);
        String name = Joel.getName();
        
        System.out.println(name);
        
        Student chris = new Student();
        chris.createStudent(1, "Chris", 70);
        String chrisName = chris.getName();
        int chrisGrade = chris.getGrade();
        
        System.out.println(chrisName +"  " + chrisGrade);
    }
    
}
