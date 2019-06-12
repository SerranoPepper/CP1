import java.util.Scanner;
public class gradecalc {
	public static void main(String[] args){
	  Scanner kin = new Scanner(System.in);
		System.out.println("Welcome To the Grade Calculator");
		System.out.println("\nPlease Enter Grades for The Homework");
		//Asking for a new variable to be stored 3 times (homework)
		System.out.print("HW1:");
		double grd1 = kin.nextDouble();
		System.out.print("HW2:");
		double grd2 = kin.nextDouble();
		System.out.print("HW3:");
		double grd3 = kin.nextDouble();
		System.out.println("\nPlease Enter Grades For The Quizzes");
		//Asking and storing both quiz grades
		System.out.print("Quiz1:");
		double qz1 = kin.nextDouble();
		System.out.print("Quiz2:");
		double qz2 = kin.nextDouble();
		System.out.println("\nPlease Enter Grades for the Final Exam");
		//Asking for and storing the final
		System.out.print("Final:");
		//Creating new variables to fin avrage
		double fnl = kin.nextDouble();
		double avg1;
		double avg2;
		double avg3;
		//Making the variables calculate average
		avg1 = (grd1+grd2+grd3) / 3.0;
		avg2 = (qz1+qz2) / 2.0;
		avg3 = fnl;
		//Showing each catagories average
		System.out.println("\nThe average of the Homework is: " + avg1 + "%");
		System.out.println("The average of the Quizzes is: " + avg2 + "%");
    System.out.println("The average of the Final Exam is: " + fnl + "%");
    //calculating final average
    double fnle = avg1*.2 + avg2*.5 + avg3*.3;
    //displaying it
    System.out.println("\nThe Final grade is: " + fnle + "%");  
	}
}