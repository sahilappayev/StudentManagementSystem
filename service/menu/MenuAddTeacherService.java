/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import service.menu.inter.MenuAddTeacherServiceInter;
import util.InputUtil;

/**
 *
 * @author SahilAppay
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter{

    @Override
    public void process() {
        Teacher teacher = new Teacher();
        teacher.setName(InputUtil.inputText("Enter name:"));
        teacher.setSurname(InputUtil.inputText("Enter surname:"));
        teacher.setAge(InputUtil.inputNumber("Enter age:"));
        
        Config.instance().appendTeacher(teacher);
        InputUtil.successMessage();
    }
    
}
