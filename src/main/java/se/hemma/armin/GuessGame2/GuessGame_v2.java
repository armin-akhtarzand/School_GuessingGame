package se.hemma.armin.GuessGame2;


import java.util.Scanner;

import se.hemma.armin.GuessGame2.Result.Results;

import static se.hemma.armin.GuessGame2.Result.Results.WIN;
import static se.hemma.armin.GuessGame2.Result.Results.LOSE;
import static se.hemma.armin.GuessGame2.Result.Results.QUIT;


public class GuessGame_v2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running = true;



        System.out.println("Welcome to Guess Game! The rules are simple.");
        System.out.println("Each level lets you guess a number within a certain range.");
        System.out.println("The difficulty increases with each level! Number of attempts will be told at the start of each level.");
        System.out.println("When your attempts are over, you start again at level 1.");
        System.out.println("Good luck!");
        System.out.println("------------------------------------------------\n");

        while (running) {

            Results result1 = Levels.playLevel(1, 1, 50, 7, sc);
            if ((result1 == LOSE) || (result1 == QUIT)) {
                if (!AskPlayAgain.playAgain()) running = false;
            } else if (result1 == WIN) {
                Results result2 = Levels.playLevel(2, 1, 100, 6, sc);
                if (result2 == WIN){
                    Results result3 = Levels.playLevel(3, 1, 1000, 9, sc);
                    if (result3 == WIN){
                        Results result4 = Levels.playLevel(4, 1, 1000000, 19, sc);
                        if (result4 == WIN){
                              System.out.println("CONGRATULATIONS!!!! YOU BEAT THE GAME!!");
                              running = false;
                        }else if (result4 == LOSE || result4 == QUIT) {
                           if(!AskPlayAgain.playAgain()) running = false;
                        }
                    } else if (result3 == LOSE|| result3 == QUIT) {
                        if (!AskPlayAgain.playAgain()) running = false;
                    }
                }else if (result2 == LOSE|| result2 == QUIT) {
                    if(!AskPlayAgain.playAgain()) running = false;
                }
            }
        }
    }
}

