/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author SahilAppay
 */
public class InputUtil {
    
    public static String inputText(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        return sc.nextLine();
    }
    
    public static int inputNumber(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        return sc.nextInt();
    }
    
    public static void successMessage() {
        System.out.println("Operation completed successfully!");
    }
}
