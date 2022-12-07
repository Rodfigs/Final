/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cookbook;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class CookBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        
        System.out.println("Hello Welcome to your CookBook!");
        System.out.println("Hello Welcome to your CookBook!");


        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "Recipe1";
                     break;
            case 2:  monthString = "Recipe2";
                     break;
            case 3:  monthString = "Recipe3";
                     break;
            case 4:  monthString = "Recipe4";
                     break;
            case 5:  monthString = "Recipe5";
                     break;
            case 6:  monthString = "Recipe6";
                     break;
            case 7:  monthString = "Recipe7";
                     break;
            case 8:  monthString = "Recipe8";
                     break;          
            default: monthString = "Invalid recipe";
                     break;
        }
        System.out.println(monthString);
    
    
    User user01 = new User("Rodrigo", true);
        user01.recipeCreate();
    
    }


}
        
        
        
        
        
        
    

        
    
    

