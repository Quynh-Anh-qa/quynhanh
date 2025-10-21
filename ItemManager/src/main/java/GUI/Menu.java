/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.util.Scanner;

/**
 *
 * @author 84346
 */
public class Menu {
    public static int getChoice(Object[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1) + ". " + options[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Choose 1.." + options.length + ": ");
        return Integer.parseInt(sc.nextLine());
    }
}

