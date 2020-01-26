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
public class Student extends Person {

    private String shoolName;
    private double scholarship;

    public String getShoolName() {
        return shoolName;
    }

    public void setShoolName(String shoolName) {
        this.shoolName = shoolName;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Age: "+ this.getAge()+
                ", Shool name: " + shoolName + ", Scholarship: " + scholarship;
    }

}
