/* 
   Program to calculate the volume and surface area 
   of a right circular cylinder.      
   Programmer: Thomas Student, File Name: Cylinder.java 
*/

// package for Scanner class objects
import java.util.Scanner;

public class Cylinder
{
  public static void main(String args[])
  {
    // introduce a Scanner class object
    Scanner sc = new Scanner(System.in);

    // declare and initialize the variables
    double height = 0, radius = 0, volume = 0, area = 0;
    String strName = "";

    // greet the program user	
    System.out.println("Welcome to the Volume Program!");
    // prompt user for their name
    System.out.println("please enter your name");
    // read the user name
    strName = sc.nextLine();
    //display the name back to the user
    System.out.println("hello " + strName);
	     
    // input: assign values to the variables	
    System.out.print("Please enter the radius. ");
    radius = sc.nextDouble(); 
    System.out.print("Please enter the height. ");
    height = sc.nextDouble();
 
    // process: compute the required quantity
    volume = 3.1416 * radius * radius * height;
    area = 2 * 3.1416 * radius * height + 2 * 3.1416 * radius * radius;
    

    // output: display the output to the user
    System.out.print("The volume of the cylinder is: ");
    System.out.print(volume);
    System.out.println(" cubic length units ");
    
    System.out.print("The area of the cylinder is: ");
	System.out.print(area);
	System.out.println(" square length units ");

    
    // dismiss the Scanner class object
    sc.close();
  }
}
