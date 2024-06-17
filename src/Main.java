import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Title
        System.out.println("PICK A CARD. ANY CARD.");

        //Set up user input scanner
        Scanner scanner = new Scanner(System.in);

        //Set up use of random class
        Random rand = new Random();

        //Prompt user to pick a card
        System.out.println("Type p to pick a card.");

        //Store user's input
        String input = String.valueOf(scanner);

        //If the user's input equals lower or upper case P, then move into main program loop...
        if (input.equals("p") || input.equals("P")) {

            //Obtain a number between 0 and 12
            int bound = rand.nextInt(13);

            //Add a 1 to the bound so that the bound is between 1 and 13.
            bound += 1;

            //If you pull an ace, do 35 push-ups.
            if (bound == 1) {
                System.out.println("You just got an Ace. Do 35 push-ups.");
            }

            //If you pull an ace, do 55 push-ups.
            else if (bound == 11) {
                System.out.println("You just got a Jack. Do 55 push-ups.");
            }

            //If you pull an ace, do 20 push-ups.
            else if (bound == 12) {
                System.out.println("You just got a Queen. Do 20 push-ups.");
            }

            //If you pull an ace, do 20 push-ups.
            else if (bound == 13) {
                System.out.println("You just got a King. Do 20 push-ups.");
            }

            else if (bound == 2){
            }
        }

        //Else, end it right there.
        else {

            System.out.println("Maybe do some push-ups next time, fatty.");
        }



    }
}
