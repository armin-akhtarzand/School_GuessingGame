package se.hemma.armin.GuessGame2;

import java.util.Scanner;

public class AskPlayAgain {

    public static void main(String[] args) {
        playAgain();
    }

    static Scanner sc = new Scanner(System.in);

    public static boolean playAgain() {

        boolean validAnswer = false;


        while(!validAnswer) {

        validAnswer = false;

        System.out.println("The game has ended! Do you want to play again? Y/N");
        String tryAgain = sc.nextLine();


        if (tryAgain.equalsIgnoreCase("y")) {
            validAnswer = true;
            return true;
        } else if (tryAgain.equalsIgnoreCase("n")) {
            System.out.println("Thank you for playing!");
            validAnswer = true;
            return false;
        } else {
            System.out.println("Invalid input! Try again");

        }

    }
        return false;
}





}
