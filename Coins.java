//Programmer: Marissa Gonçalves
//Date: August 25, 2017
//Purpose: This program must display the output of coin amounts to add up to its input, 3769 cents.

import java.util.Scanner;

public class Coins

{
     public static void main (String [] args)

	 {
		 Scanner keyboard = new Scanner(System.in);

         //allow the change to be inputed in the program;
		 System.out.print ("Enter change in cents: ");
		 int change = keyboard.nextInt();

		 System.out.println ();

         //calculate the amount of each coin needed to add up to the change;
		 int toonies = (change / 200);
		 int loonies = (change % 200 / 100);
		 int quarters = (change % 200 % 100 / 25);
		 int dimes = (change % 200 % 100 % 25 / 10);
		 int nickels = (change % 200 % 100 % 25 % 10 / 5);
		 int pennies = (change % 200 % 100 % 25 % 10 % 5 / 1);

         System.out.println ();

         //write a conclusion pertaining to the total amount of the added coins and intial change;
         int coins = toonies + loonies + quarters + dimes + nickels + pennies;
		 System.out.println ("A minimum of " + coins +  " coins to make change for " + change + " cents.");

		 System.out.println ("Toonies  : " + toonies);
		 System.out.println ("Loonies  : " + loonies);
         System.out.println ("Quarters : " + quarters);
         System.out.println ("Dimes    : " + dimes);
         System.out.println ("Nickels  : " + nickels);
         System.out.println ("Pennies  : " + pennies);

         System.out.println ();

      }

}