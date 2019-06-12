//Elijah Serrano and Ricardo Gonzalez
public class Craps { 

   public static void main(String[] args) {
      int dice;
      dice = (int)(6.0*Math.random() + 1.0) +
             (int)(6.0*Math.random() + 1.0);

      if (dice == 2 || dice == 3 || dice == 12) {
	 System.out.println("First roll: " + dice);
         System.out.println("You Lose!");
      }
      else if (dice == 7 || dice == 11) {
	 System.out.println("First roll: " + dice);
         System.out.println("You Win!");
      }
      else { 
	System.out.println("First roll: " + dice);
	System.out.println("Roll Again");
         int point = dice; 
         while (true) {
            dice = (int)(6.0*Math.random() + 1.0) +
                   (int)(6.0*Math.random() + 1.0);
            System.out.println("Next roll: " + dice);
 	    System.out.println("Roll Again");
            if (dice == point) {
               System.out.println("Next roll:" + dice);
		System.out.println("You Win!" );
               break;
            }
            else if (dice == 7) {
               System.out.println("You Lose!");
	  
               break; 
            }
         }
      }
   }
}
