/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.FileUtil;

/**
 *
 * @author SahilAppay
 */
public class Config implements Serializable {

    private static Config config = null;
    private static final String fileName = "config.con";
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];
    private transient boolean loggedIn;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
        save();
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
        save();
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public static Config instance() { //singleton pattern
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public void appendStudent(Student s) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }

        newStudents[newStudents.length - 1] = s;

        students = newStudents;
        save();
    }

    public void appendTeacher(Teacher t) {
        Teacher[] newTeachers = new Teacher[teachers.length + 1];
        for (int i = 0; i < teachers.length; i++) {
            newTeachers[i] = teachers[i];
        }

        newTeachers[newTeachers.length - 1] = t;

        teachers = newTeachers;
        save();
    }

    public static void initialize() {
        Object obj = FileUtil.readObject(fileName);

        if (obj == null) {
            return;
        }

        if (obj instanceof Config) {
            config = (Config) obj;
        }
    }
    public void save(){
        try {
            FileUtil.writeObjectToFile(fileName, config);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
