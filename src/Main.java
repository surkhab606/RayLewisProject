import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Title
        System.out.println("PICK A CARD. ANY CARD.");

        //Set up user input scanner
        Scanner scanner = new Scanner(System.in);

        //Prompt user to pick a card
        System.out.println("Type p to pick a card.");

        //Store user's input
        String input = String.valueOf(scanner);

        //If the user's input equals lower or upper case P, then move into main program loop...
        if (input.equals("p") || input.equals("P")) {


        }

        //Else, end it right there.
        else {

            System.out.println("Maybe do some push-ups next time, fatty.");
        }



    }
}
