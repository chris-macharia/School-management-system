package com.mycompany.schoolmanagementsystem;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher Joel = new Teacher();  //first teacher object
        Joel.createTeacher(1, "Joel", 70000);
        String name = Joel.getName();
        Teacher Lizzy = new Teacher(); //second teacher object.
        Lizzy.createTeacher(2, "Lizzy", 55000);
        
        System.out.println(name);
        
        Student chris = new Student(); //first student object
        chris.createStudent(1, "Chris", 70);
        String chrisName = chris.getName();
        int chrisGrade = chris.getGrade();
        Student Maina = new Student(); //second Student Object
        Maina.createStudent(2, "maina", 65);
        
        System.out.println(chrisName +"  " + chrisGrade);
        
        
       List<Teacher> teachers = new ArrayList<Teacher>();
       teachers.add(Joel);
       teachers.add(Lizzy);
       
       List<Student> students = new ArrayList<Student>();
       students.add(chris);
       students.add(Maina);
        
       School jkuat = new School(teachers, students); //new school object. 
       System.out.println(jkuat.getStudents());
       
       Maina.updateFees(20000);
       System.out.println(jkuat.getMoneyEarned());
    }
    
}
