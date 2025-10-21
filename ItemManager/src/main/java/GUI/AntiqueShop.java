/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

/**
 *
 * @author 84346
 */
public class AntiqueShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] options = {"Create a Vase","Create a Statue","Create a Painting","Display the Item"};
        Item item = null;
        int Choice = 0;
        do{
            
            Choice = Menu.getChoice(options);
            switch(Choice){
                case 1:
                    item = new Vase();
                    ((Vase)item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue)item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting)item).inputPainting();
                    break;
                case 4:
                    if (item != null){
                        if(item instanceof Vase)
                            ((Vase)item).outputVase();
                        else if(item instanceof Statue)
                            ((Statue)item).outputStatue();
                        else if(item instanceof Painting)
                            ((Painting)item).outputPainting();
                    } else System.out.println("you need to create an object");
                    break;
            }          
        } while(Choice <= 4);        
    }
}
