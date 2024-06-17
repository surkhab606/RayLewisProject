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
        String input = scanner.nextLine();

        //If the user's input equals lower or upper case P, then move into main program loop...
        if (input.equals("p") || input.equals("P")) {

            //Obtain a number between 0 and 12
            int bound = rand.nextInt(13);

            //Add a 1 to the bound so that the bound is between 1 and 13.
            bound += 1;

            switch(bound) {

                //If the random number generator generates a 1, you pulled an ace.
                case 1:
                    System.out.println("You pulled an Ace. Do 35 push-ups.");
                    break;

                //If the random number generator generates an 11, you pulled a jack.
                case 11:
                    System.out.println("You pulled a Jack. Do 55 push-ups.");
                    break;

                //If the random number generator generates a 12, you pulled a queen.
                case 12:
                    System.out.println("You pulled a Queen. Do 20 push-ups.");
                    break;

                //If the random number generator generates a 13, you pulled a king.
                case 13:
                    System.out.println("You pulled a king. Do 20 push-ups.");
                    break;

                //If the random number generator generates anything from 2-10, you pulled a 2-10 numbered card.
                default:
                System.out.println("You pulled a " + bound + ". Do " + bound + " push-ups.");
                break;
            }

            }

        //Else, end it right there.
        else {

            System.out.println("Maybe do some push-ups next time, fatty.");
        }



    }
}
