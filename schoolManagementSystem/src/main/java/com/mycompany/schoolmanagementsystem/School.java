
package com.mycompany.schoolmanagementsystem;
import java.util.List;

public class School {
    private List<Teacher> teachers; //you don't have to declare the size.
    private List<Student> students;
    private static int moneyEarned;
    private static int moneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        int moneyEarned = 0;
        int moneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;    
    }

    public void addTeacher(Teacher teacher) { //this code adds a teacher to the
        teachers.add(teacher);                 //list of teachers in a school.
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) { //adds a student to the school.
        students.add(student);
    }

    public int getMoneyEarned() {
        return moneyEarned;
    }

    public static void updateMoneyEarned(int money){
        moneyEarned += money;
    }

    public int getMoneySpent() {
        return moneySpent;
    }
    
    /**
     * updates  the total money spent
     * @param money is the money that has been spent
     */
    public static void updateMoneySpent(int money) {
        moneySpent -= money;
    }
    
    
    
    
}
