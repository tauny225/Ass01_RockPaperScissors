import java.util.Scanner;

public class Ass01_RockPaperScissors {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String playA = "R";
        String playB = "P";
        String playAgain = "Y";

        do {
            do {
                System.out.print("Please Player A, enter your choice(must be R, P, S or r, p, s) to play: ");
                playA = in.nextLine();
               }
            while ((!playA.equalsIgnoreCase("R")) && (!playA.equalsIgnoreCase("S")) && (!playA.equalsIgnoreCase("P")));

            do {
                System.out.print("Please Player B, enter your choice(must be R, P, S or r, p, s) to play: ");
                playB = in.nextLine();
                }
            while ((!playB.equalsIgnoreCase("R")) && (!playB.equalsIgnoreCase("S")) && (!playB.equalsIgnoreCase("P")));

            if (playA.equalsIgnoreCase("R")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("This is a tie Rock vs Rock");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock, Player B wins");
                } else {
                    System.out.println("Rock breaks Scissors, Player A wins");
                }
            } else if (playA.equalsIgnoreCase("P")) {
                if (playB.equalsIgnoreCase("P")) {
                    System.out.println("This is a tie, Paper vs Paper");
                } else if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock, Player A wins");
                } else {
                    System.out.println("Scissors cut Paper, Player B wins");
                }

            } else if (playA.equalsIgnoreCase("S")) {
                if (playB.equalsIgnoreCase("S")) {
                    System.out.println("This is a tie, Scissors vs Scissors");
                } else if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors, Player B wins");
                } else {
                    System.out.println("Scissors cut Paper, Player A wins");
                }

            }
            System.out.println("Do you want to play again [Y/N]: ");
            playAgain = in.nextLine();

        } while (playAgain.equalsIgnoreCase("Y"));
    }
}
