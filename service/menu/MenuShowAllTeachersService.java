/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import service.menu.inter.MenuShowAllTeacherServiceInter;

/**
 *
 * @author SahilAppay
 */
public class MenuShowAllTeachersService implements MenuShowAllTeacherServiceInter{

    @Override
    public void process() {
       Teacher[] teachers = Config.instance().getTeachers();
       for(int i = 0; i< teachers.length; i++){
           System.out.println(teachers[i]);
       }
    }
    
}
