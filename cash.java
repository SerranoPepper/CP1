import java.util.Scanner;

public class cash{
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
      //requesting the bill
    System.out.println("Welcome to the Change Generator");
    System.out.println("\nPlease Enter the amount of a Bill");
    System.out.print("\nBill: ");
      //storing it as a variable
		double due = kin.nextDouble();
      //requesting the amount paid
		System.out.println("\nPlease Enter the amount Paid");
		System.out.print("\nPaid: ");
       //storing it as a variable
		double given = kin.nextDouble();
		//calculating change due
		double change = given - due;
		System.out.println("\nChange: $" + change);
		// taking the change, dividing it by the change, giving the amount of bills then taking the remainder to divide next
		int twenty = (int)change / 20; 
		int ten = (int)change % 20 / 10;
		int five = (int)change % 10 / 5;
		int one = (int)change % 5 / 1;
		double pnttwofive = (double)change % 1 / .25;
		double pntten = (double)change % .25 / .1;
		double pntfive = (double)change % .1 / .05;
		double pntone = (double)change % .05 / .01;
    //printing the bills given
    System.out.println("$20: " + twenty);
    System.out.println("$10: " + ten);
    System.out.println("$5: " + five);
    System.out.println("$1: " + one);
    System.out.println("$.25: " + (int)pnttwofive);
    System.out.println("$.10: "+ (int)pntten);
    System.out.println("$.05: "+ (int)pntfive);
    System.out.println("$.01: " + (int)pntone);

  }
}
