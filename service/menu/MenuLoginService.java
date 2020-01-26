/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import service.menu.inter.MenuLoginServiceInter;
import service.menu.inter.MenuService;
import util.InputUtil;

/**
 *
 * @author SahilAppay
 */
public class MenuLoginService implements MenuLoginServiceInter{

    @Override
    public void process() {
        String username = InputUtil.inputText("Enter username:");
        String password = InputUtil.inputText("Enter password:");
        
        if(!("Sahil".equals(username) && "12345".equals(password))){
            throw new IllegalArgumentException("Username or password is incoorect!");
        }
        Config.instance().setLoggedIn(true);
    }
    
}
