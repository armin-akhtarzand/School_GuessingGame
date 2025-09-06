package se.hemma.armin.GuessGame2;

import java.util.Scanner;

public class Levels {


    public static void main(String[] args) {



    }



    public static Result.Results playLevel(int level, int min, int max, int tries, Scanner sc){
        int secret = (int) (Math.random() * (max - min + 1)) + min;
        int guess;

        System.out.println("Welcome to Level" + level + ": Choose a number between: "+ min + "-" +max+"\n"+"Attempts: "+ tries);




       for (int i = tries; i > -1; i--) {

           System.out.print("Guess a number: ");
           String input = sc.nextLine().trim();

           if (input.equalsIgnoreCase("q"))return Result.Results.QUIT;


           try{
               guess = Integer.parseInt(input);

           }catch(NumberFormatException e){
               System.out.println("Invalid input! Try again");
               i++;
               continue;
           }

           if (guess == secret) {
               System.out.println("Well done! You cleared this level! ");
               return Result.Results.WIN;
           }else if (guess < min || guess > max) {
               System.out.println("Out of range! Guess a number between: " + min +"-"+max);
               i++;
               continue;

           } else if (guess < secret) {
               System.out.println("Too low! Tries left: " + i);

           }else if (guess > secret) {
               System.out.println("Too High! Tries left: " + i);
           }
       }
        System.out.println("GAME OVER! The correct answer was " + secret);
        return Result.Results.LOSE;




    }
}
