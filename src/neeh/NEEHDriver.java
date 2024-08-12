/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neeh;

//importing scanner
import java.util.Scanner;


// This is a driver program to test the Number of effective exercise in hours.
public class NEEHDriver 
{
  public static void main(String[] args) 
 {    
  //creating instance of object to count the NEEH from
  int[] NEEH = {5, 4, 3, 5, 7, 11, 7, 7, 9, 10, 3, 7, 4, 5, 6};
  NEEH NEEHAnalyzer = new NEEH(NEEH);
        
  //display a welcome message
  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<");
  System.out.println("         Welcome to Athlete Evaluation Software      ");
  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<");
  System.out.println();
  System.out.println("Choose the display format:\n==========================");
  System.out.println("""
                        1 - Column Format
                        2 - Histogram
                        3 - both
                        4 - Quit
                ==========================""");
  System.out.print("Please enter your choice:");// to ask user for a choice
    
  try (Scanner in = new Scanner(System.in)) 
 {
  // declare a user input variable for choice   
  int choice = in.nextInt();

  // this is to repeat "try again" if the user enters an invalid input
   while (choice<1 || choice>4)
  {
   System.out.print("Invalid choice!!! Try again:");
   choice = in.nextInt(); //to enter another number for choice
  }
 
   switch (choice) 
  {
    case 1 -> 
   {
     // choice 1
     System.out.println();
     System.out.println(">>The number of athletes with");
     System.out.println();
     System.out.println();
   
     //display the column format              
     NEEHAnalyzer.DisplayColumnformat();
     
     // escape sequence
     System.out.println("\n"); 
                 
                 
     System.out.println(">>The number of athletes with NEEH");//
     System.out.println();
                 
     // to repeat "above" and i which is  the NEEH
     for (int i = 3; i <= 11; i++)
     {
      System.out.print("above " + i + " is " +
      NEEHAnalyzer.setAboveNEEH(i));
                      
       //to display
       if (i % 2 == 0 && i < 11)
      {
       System.out.println();                   
      }
     
      // to output space between each "above" statement                  
      else 
      {
       System.out.print("    ");
      }
     }  //end of for loop
   }
  
    case 2 -> 
   {
    //choice 2
    System.out.println();
    System.out.println(">>Generated Histogram:");
    System.out.println();
     
    //display histogram format
    NEEHAnalyzer.DisplayHistogramformat();
   }
             
    case 3 -> 
   {
    //choice 3
    System.out.println();
    System.out.println(">>The number of athletes with");
    System.out.println();
                 
    NEEHAnalyzer.DisplayColumnformat();
    System.out.println();
                 
    System.out.println("\n>>Generated Histogram:");
    System.out.println();
                 
    NEEHAnalyzer.DisplayHistogramformat();
    System.out.println("\n");
    System.out.println(">>The number of athletes with NEEH");
    System.out.println();
     
    //to display the number of athletes above the NEEH
      for (int i = 3; i <= 11; i++)
     {
       System.out.print("above " + i + " is " + NEEHAnalyzer.setAboveNEEH(i));
       if (i % 2 == 0 && i < 11)
      {
       System.out.println();
      }
       else
      {
        System.out.print("            ");
      }
     }  //end of for loop
   }
            
    case 4 ->
   {
    //choice 4
    System.out.println();
    System.out.println("See you next time!");
    System.exit(0);// to quit the system
   }
  } // end of switch case loop
  //close the scanner input
 }
 // declare a user input variable for choice
         
 System.out.println();
 System.out.println();
 System.out.println(">>The NEEH recorded by the maximum number of athletes: " 
                + NEEHAnalyzer.NEEHbyMaxAthletes());
        
 //closing message  
 System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<");     
 System.out.println("             Thanks for using our system!           ");      
 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<");       

 }
}

