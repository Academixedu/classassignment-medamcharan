package com.example;


public class Student{
 private String  Name;
 private  int Age;
 private int StudentCount;

    public Student(String Name,int Age) {
        this.Age = Age;
        this.Name = Name;
    }

    public Student(int StudentCount) {
        this.StudentCount = StudentCount;
    }
    

    public void setStudentCount(int studentCount) {
        StudentCount = studentCount;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    public void displayDetails(){
        System.out.println("name"+Name);
        System.out.println("Age"+Age);

    }

    

   

    public int getStudentCount() {
        return StudentCount;
    }

}