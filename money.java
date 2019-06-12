
import java.util.Scanner;

public class money{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

String fName = "Robert";
String lName = "Berg";

String fLet1 = fName.substring(0,1);
String fLet2 = lName.substring(0,1);

String rest1 = fName.substring(1);
String rest2 = lName.substring(1);

String pl1 = rest1 + fLet1 + "ay";
String pl2 = rest2 + fLet2 + "ay";

System.out.println(pl1);
System.out.println(pl2);




}
}