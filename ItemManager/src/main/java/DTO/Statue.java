/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author 84346
 */
import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {}

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public void inputStatue() {
        Scanner sc = new Scanner(System.in);
        input();
        // Nhap weight (>0)
        while (true) {
            try {
                System.out.print("Enter weight (>0): ");
                weight = Integer.parseInt(sc.nextLine().trim());
                if (weight > 0) break;
                else System.out.println("Error: cannot assign negative weight. Try again!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Try again.");
            }
        }
        // Nhap colour 
        while(true){
            try{
                System.out.println("Enter colour (not empty)");
                colour = sc.nextLine().trim();
                if(colour.isEmpty()){
                    throw new Exception("Error: cannot assign empty colour. Try again!");
                }
                if(!colour.matches("[a-zA-Z]+")){
                    throw new Exception("Colour must contain letters only!");
                }
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void outputStatue() {
        output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
}

