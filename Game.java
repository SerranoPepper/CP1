import java.util.Scanner;

public class Game{
    
    static int personx = 0, persony = 0; //The start cordinates
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);
        String input;
        
        int endx = 0, endy = 0;
        while (endx == 0 && endy ==0){
            endy = (int) (Math.random() * 4);
            endx = (int) (Math.random() * 4);
        }
        char[][] gameboard = new char[4][4];
        
        for (int row = 0; row < gameboard.length; row++){
            for(int coll = 0; coll < gameboard[0].length; coll++){
                gameboard[row][coll] = '0';
            }
        }

        gameboard[persony][personx] = 'x';
        gameboard[endy][endx] = '*';
        
        System.out.println("Welcome to my array game! The goal is to move your character x to the end point *");
        System.out.println("\nInitial Gameboard:");
        
        while (persony != endy || personx != endx) {
           System.out.println(gameboard);
            System.out.print("\nWhere do you want to go? (up,down,left,right)?");
            input = kin.nextLine();

            gameboard[persony][personx] = '0';
            check(input);
            
            gameboard[persony][personx] = 'x';
        }
    }
}
