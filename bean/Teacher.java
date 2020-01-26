/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author SahilAppay
 */
public class Teacher extends Person{
    private String shoolName;
    private double salary;
    private Student[] students;

    public String getShoolName() {
        return shoolName;
    }

    public double getSalary() {
        return salary;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Age: "+ this.getAge()+
                ", Shool name: " + shoolName + ", Salary: " + salary;
    }
}
