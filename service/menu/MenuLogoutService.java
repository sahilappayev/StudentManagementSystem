/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import service.menu.inter.MenuLogoutServiceInter;
import service.menu.inter.MenuService;

/**
 *
 * @author SahilAppay
 */
public class MenuLogoutService implements MenuLogoutServiceInter{

    @Override
    public void process() {
        Config.instance().setLoggedIn(false);
    }
}
