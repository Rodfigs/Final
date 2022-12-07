/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cookbook;
import java.util.Scanner;
/**
 *
 * @author rodri
 */
public class User {
    private String name;
    int page;
    private boolean adminPriv;
   
    Scanner Food = new Scanner(System.in);
    String ingredient;

    public int getPage() {
        return page;
    }

    public void setPage(int Page) {
        this.page = Page;
    }
    
    
    
   public void Admin(String name, Boolean admin, int page) {
        this.name = name;
        this.adminPriv = true;
        this.page = page;
        
        
    }

    public boolean isAdminPriv() {
        return adminPriv;
    }

    public void setAdminPriv(boolean adminPriv) {
        this.adminPriv = adminPriv;
    }

   

    public User(String name, Boolean admin) {
        this.name = name;
        
        
    }

    public boolean isAdmin() {
        return adminPriv;
    }

    public void setAdmin(boolean admin) {
        this.adminPriv = admin;
    }

    public Scanner getFood() {
        return Food;
    }

    public void setFood(Scanner Food) {
        this.Food = Food;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
    
    
    
  


    public boolean isLocationSet() {
        return adminPriv;
    }

    public void setLocationSet(boolean locationSet) {
        this.adminPriv = locationSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 

    
    
    
    public void recipeCreate(){
        
        if (adminPriv == true){
        System.out.println("Please enter your ingredients for your recipe: ");
//        for (int i == 0; i == 1; )
//        {
//            ingredient = Food.nextLine();
//        }

            int i;
          for (i = 0; i == 2; ++i ) 
          { 
             ingredient = Food.nextLine();          
             
             System.out.println("Please enter 0 to keep entering food");
             
             i = Food.nextInt(); 
             
          } 


        }else {
        System.out.println("You cannot add recipes");
 
               
        
        }
            
         
    }


}
