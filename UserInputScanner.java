
import java.util.Scanner;

public class UserInputScanner{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.print("What is your name? ");
		String name = kin.nextLine();
		System.out.print("What is your last name? ");
		String last = kin.nextLine();

		System.out.println("Hello " + name + " " + last+ ", it's nice to meet you!");
		System.out.print("What is your Street Address? ");
		String add = kin.nextLine();
		System.out.print("What is your City? ");
		String cit = kin.nextLine();
		System.out.print("What is your State? ");
		String stat = kin.nextLine();
		System.out.print("What is your Zip? ");
		String zip = kin.nextLine();
		System.out.println(name + " " + last);
		System.out.println(add);
		System.out.println(cit + ", " + stat + " " + zip);
	}
}
