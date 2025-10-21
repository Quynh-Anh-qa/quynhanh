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

public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {}

    public Painting(int value, String creator, int height, int width,
                    boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public void inputPainting() {
        Scanner sc = new Scanner(System.in);
        input();
        // nhap height
        while (true) {
            try {
                System.out.print("Enter height (>0): ");
                height = Integer.parseInt(sc.nextLine().trim());
                if (height > 0) break;
                else System.out.println("Error: cannot assign negative height. Try again!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Try again.");
            }
        }
        // Nhap width
        while (true) {
            try {
                System.out.print("Enter width (>0): ");
                width = Integer.parseInt(sc.nextLine().trim());
                if (width > 0) break;
                else System.out.println("Error: cannot assign negative width. Try again!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Try again.");
            }
        }
        // Nhap isWatercolour
        while(true){
            try{
                System.out.println("Is watercolour (true/false): ");
                String input = sc.nextLine().trim().toLowerCase();
                if(!input.equals("true") && !input.equals("false")){
                    throw new Exception("Only 'true' or 'false' is allowed!");
                }
                isWatercolour = Boolean.parseBoolean(input);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        // Nhap isFramed
        while(true){
            try{
                System.out.println("Is framed (true/false): ");
                String input = sc.nextLine().trim().toLowerCase();
                if(!input.equals("true") && !input.equals("false")){
                    throw new Exception("Only 'true' or 'false' is allowed!");
                }
                isFramed = Boolean.parseBoolean(input);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void outputPainting() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Watercolour: " + isWatercolour);
        System.out.println("Framed: " + isFramed);
    }
}
