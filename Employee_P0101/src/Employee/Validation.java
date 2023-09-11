/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.Scanner;

public class Validation {
    static final Scanner sc = new Scanner(System.in);
    
    public static int checkUserChoice(int max, int min)
    {
        while (true) {            
            try {
            int choice = Integer.parseInt(sc.nextLine().trim());
            if ( choice < min || choice > max)
            {
                throw new NumberFormatException();
            }
            return choice;

        } catch (NumberFormatException e) {
            System.out.println("Enter choice from " + min +" to "+max + ":");
        }
        }
        
    }
    
    public static String checkString()
    {
        while (true) {            
            String output = sc.nextLine().trim();
            if( output.isEmpty())
            {
                System.out.print("Is empty, please enter again: ");
            }
            else
            {
                return output;
            }
        }      
    }
    
    public static int  checkInt (){
        while (true) {            
            try 
            {
                int output = Integer.parseInt(sc.nextLine().trim());
                return output;
            } 
            catch (NumberFormatException e)
            {
                System.out.println("Please input a number integer");
            }
        }
    }
    
    public static double checkDouble (){
        while (true) {            
            try 
            {
                double output = Double.parseDouble(sc.nextLine().trim());
                return output;
            } 
            catch (NumberFormatException e)
            {
                System.out.println("Please input a double number");
            }
        }
    }
    
    public static boolean checkUserApprove(){
        while (true) { 
            System.out.println("Enter Y/N: ");
            String choice = checkString().toUpperCase();
            if( choice.equalsIgnoreCase("Y"))
            {
                return true;
            }
            if(choice.equalsIgnoreCase("N"))
            {
                return false;
            }
            System.out.println("Enter again");
        }      
    }
}