/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author SahilAppay
 */
public class MenuUtil {

    public static void showMenu() {
        Menu.showAllMenu();
        int selectedMenu = InputUtil.inputNumber("Please, select menu:");
        Menu.findMenu(selectedMenu).process();
    }

//    public static void processMenu(Menu menu) {
//        menu.process();
//    }

}
