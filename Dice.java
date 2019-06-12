import java.util.Scanner;

public class Dice{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

   		char choice;

		System.out.println("Rolling Two Dice");

   do
     {

	int dice1=(int)(Math.random()*6+1);o
    	int dice2=(int)(Math.random()*6+1);

	System.out.print("Die 1: " + dice1 + ", ");
	System.out.print("Die 2: " + dice2 + ", ");
	System.out.println("sum of two dice: " + (dice1 + dice2));system.out.println

		System.out.print("Would You like to roll again? (y/n) ");
		choice = kin.next().charAt(0);

 }

   while ((choice == 'y') || (choice == 'Y'));


	System.out.println("Goodbye");



	}
}
