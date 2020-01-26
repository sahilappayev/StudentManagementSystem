/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Config;
import service.menu.inter.MenuService;
import service.menu.MenuAddStudentService;
import service.menu.MenuAddTeacherService;
import service.menu.MenuLoginService;
import service.menu.MenuLogoutService;
import service.menu.MenuRegisterService;
import service.menu.MenuShowAllStudentsService;
import service.menu.MenuShowAllTeachersService;

/**
 *
 * @author SahilAppay
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "Show all teachers", new MenuShowAllTeachersService()),
    SHOW_ALL_STUDENT(6, "Show all students", new MenuShowAllStudentsService()),
    LOGOUT(7, "Logout", new MenuLogoutService()),
    UNKNOWN;

    private String label;
    private MenuService service;
    private int number;

    private Menu() {
    }

    Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return (number + ". " + label);
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (Menu menu : menus) {
            if (menu != UNKNOWN) {
                if (menu == LOGIN || menu == REGISTER) {
                    if(!Config.instance().isLoggedIn())
                    System.out.println(menu);
                } else if (Config.instance().isLoggedIn()) {
                    System.out.println(menu);
                }
            }
        }
    }

    public static Menu findMenu(int number) {
        Menu[] menus = Menu.values();
        for (Menu menu : menus) {
            if (number == menu.getNumber()) {
                return menu;
            }
        }
        return Menu.UNKNOWN;
    }
}
