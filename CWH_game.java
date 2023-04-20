import java.util.Scanner;

public class CWH_game {
    public static final String rock = "1";
    public static final String paper = "2";
    public static final String scissor = "3";

    public static void main(String[] args) {
        System.out.println("Enter any number between 1 to 3");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println();

        String playerMove = getPLayerMove();
        String computerMove = getComputerMove();
        if (playerMove.equals(computerMove)) {
            System.out.println("Game is Tie!!");
        } else if (playerMove.equals(Game.rock)) {
            System.out.println(computerMove.equals(Game.paper) ? "Computer Wins" : "Player wins");
        } else if (playerMove.equals(Game.paper)) {
            System.out.println(computerMove.equals(Game.scissor) ? "Computer Wins" : "Player wins");
        } else {
            System.out.println(computerMove.equals(Game.rock) ? "Computer Wins" : "Player wins");
        }

    }
}
