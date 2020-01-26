/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Student;
import service.menu.inter.MenuAddStudentServiceInter;
import service.menu.inter.MenuService;
import util.InputUtil;
import util.MenuUtil;

/**
 *
 * @author SahilAppay
 */
public class MenuAddStudentService implements MenuAddStudentServiceInter {

    @Override
    public void process() {

        Student student = new Student();
        student.setName(InputUtil.inputText("Enter name:"));
        student.setSurname(InputUtil.inputText("Enter surname:"));
        student.setAge(InputUtil.inputNumber("Enter age:"));
        
        Config.instance().appendStudent(student);
        InputUtil.successMessage();
    }

}
