/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author 84346
 */
public class Item {
    int value;
    String creator;
    public Item(){
        value = 0;
        creator = "";
    }
    public Item(int value,String creator){
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        // Nhap va kiem tra value
        do {
            System.out.print("Enter value (>0): ");
            value = sc.nextInt();
            if (value <= 0) {
                System.out.println("Error: cannot assign negative value. Try again!");
            }
        } while (value <= 0);
        sc.nextLine(); // clear buffer
        // Nhap va kiem tra creator
        do {
            System.out.print("Enter creator (not empty): ");
            creator = sc.nextLine().trim();   //trim() xóa hết khoảng trắng thừa
            if (creator.isEmpty()) {
                System.out.println("Error: cannot assign empty creator. Try again!");
            }
        } while (creator.isEmpty());
    }

    // output
    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
}