/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vadition;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Validation {
    
    private static final Scanner sc = new Scanner(System.in);

    public static int Int() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
            return Int();
        }
    }

    public static String String() {
        try {
            return sc.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Invalid string format!");
            return String();
        }
    }
    
}


