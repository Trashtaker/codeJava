/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bublesort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class BubleSort{
    
    //check user input valid
    private static int input(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array:");
        //loop until user input correct
        while (true) {  
            try {
                double tmp = Double.parseDouble(sc.nextLine().trim());
                int output  = (int) tmp;
                if(output <=0)
                {
                    throw  new NumberFormatException();
                }
                return output;
            }
            catch (NumberFormatException e) 
            { 
                System.out.println("Wrong input, enter again please");
            }
        }    
    }
    
    //buble sort
    private static void sort(int[] a)
    {
        //loop to print unsorted array 
        System.out.print("Unsorted array: \n");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        
        //loop to sort array
        for ( int i =1; i< a.length; i++)
        {
            for (int j =0; j< a.length -1;j++)
            {
                if( a[j] > a[j+1]) 
                {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= tmp;
                }
            }
        }
        
        //loop to print sorted array 
        System.out.print("Sorted array: \n");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    
    //add random value to array
    private static int[] addValue(int n){
        int[] a = new int[n];
        Random random = new Random();
        //loop to add random value to array 
        for(int i =0; i<a.length; i++)
        {
            int randomNumber = random.nextInt(n);
            a[i] =  randomNumber;       
        }
        return a;
    }
    
    public static void main(String[] args) {
        int n = input();
        int[] a = addValue(n);
        sort(a);    
    }
     
    
    
}
