/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Student;
import service.menu.inter.MenuService;
import service.menu.inter.MenuShowAllStudentServiceInter;

/**
 *
 * @author SahilAppay
 */
public class MenuShowAllStudentsService implements MenuShowAllStudentServiceInter{

    @Override
    public void process() {
        Student[] students = Config.instance().getStudents();
       for(int i = 0; i <students.length; i++){
           System.out.println(students[i]);
       }
    }
    
}
