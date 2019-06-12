import java.util.Scanner;

class Taxes {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Calculating Income Tax");
    System.out.println();
    System.out.print("Total income for the year: $");
    Double monie = scan.nextDouble();
    Double tax = 0.00;
    
    if(monie >= 500000){
      tax = 150689.50 + (0.37*(monie-500000));
    }
    else if(monie >= 200000 && monie <= 500000){
      tax = 45689.5 + (0.35*(monie-200000));
    }
    else if(monie >= 157500 && monie <= 200000){
      tax = 32089.5 + (0.32*(monie-157500));
    }
    else if(monie >= 82500 && monie <= 157500){
      tax = 14089 + (0.24*(monie-82500));
    }
    else if(monie >= 38700 && monie <= 82500){
      tax = 4453.5 + (0.22*(monie-38700));
    }
    else if(monie >= 9525 && monie <= 38700){
      tax = 952.5 + (0.12*(monie-9525));
    }
    else if(monie >= 0 && monie <= 9525){
      tax = 0.1 * monie;
    }
    
    System.out.println();
    System.out.println("Tax to be paid: $" + tax);
  }
}
