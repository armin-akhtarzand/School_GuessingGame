package se.hemma.armin.checklist1;

import java.util.Scanner;

public class GuessGame_Demo {
    public static void main(String[] args) {

        //Random generator for every level
        int numberLevel1 = (int) (Math.random() * 50) +1;
        int numberLevel2 = (int) (Math.random() * 100) +1;
        int numberLevel3 = (int) (Math.random() * 1000) +1;

        Scanner sc = new Scanner(System.in);
        String keepGoing;
        boolean quitGame = false;

        //Welcome and rules
        System.out.println("\nVälkommen till gissa talet!");
        System.out.println("Spelet går ut på att gissa ett tal inom olika intervall");
        System.out.println("Nivå 1: 1-50 (8 försök)\nNivå 2: 1-100 (7 försök) \nNivå 3: 1-1000 (10 försök)");
        System.out.println("Du kan alltid avsluta spelet genom att trycka på (Q)");
        System.out.println("Lycka till!\n");


        for (int i = 7; i > -1 ; i--) {

            if(quitGame){
                break;
            }

            System.out.print("Gissa ett tal: ");
            String input = sc.nextLine().trim(); //Catch blank inputs and letters (also catches "quit")

            //Messages for blanks,letters and also catches "quit"
            if (input.isEmpty()) {
                System.out.println("Tom inmatning: skriv ett tal 1-50");
                i++;
                continue;
            } else if (input.equalsIgnoreCase("q")) {
                System.out.println("Spelet avslutas!");
                break;
            }else if (!input.matches("\\d+")) {
                System.out.println("Ogiltig inmatning: skriv ett tal 1-50");
                i++;
                continue;
            }
            int guess1 = Integer.parseInt(input); //Input of guess & ignore blank spaces between the number
            if(guess1 == numberLevel1) {
                System.out.println("Grattis! Svaret var: "+numberLevel1);
                System.out.println("Du har gått vidare till Nivå 2!(1-100)");
                System.out.println("Vill du fortsätta? Ja/Nej");
                keepGoing = sc.nextLine().trim();
                if (keepGoing.equalsIgnoreCase("Ja")) {
                    for (int j = 6; j > -1 ; j--) {

                        if(quitGame){
                            break;
                        }


                        System.out.print("Gissa ett tal: ");
                        String input2 = sc.nextLine().trim();
                        if (input2.isEmpty()) {
                            System.out.println("Tom inmatning: skriv ett tal 1-100");
                            j++;
                            continue;
                        } else if (input2.equalsIgnoreCase("q")) {
                            System.out.println("Spelet avslutas!");
                            quitGame = true;
                            break;
                        } else if (!input2.matches("\\d+")) {
                            System.out.println("Ogiltig inmatning: skriv ett tal 1-100");
                            j++;
                            continue;
                        }
                        int guess2 = Integer.parseInt(input2);
                        if (guess2 == numberLevel2) {
                            System.out.println("Grattis! Svaret var: " + numberLevel2);
                            System.out.println("Du har gått vidare till Nivå 3!(1-1000)");
                            System.out.println("Vill du fortsätta? Ja/Nej");
                            keepGoing = sc.nextLine().trim();
                            if (keepGoing.equalsIgnoreCase("Ja")) {
                                for (int k = 9; k > -1; k--) {

                                    System.out.print("Gissa ett tal: ");
                                    String input3 = sc.nextLine().trim();
                                    if (input3.isEmpty()) {
                                        System.out.println("Tom inmatning: skriv ett tal 1-1000");
                                        k++;
                                        continue;
                                    } else if (input3.equalsIgnoreCase("q")) {
                                        System.out.println("Spelet avslutas!");
                                        quitGame = true;
                                        break;
                                    } else if (!input3.matches("\\d+")) {
                                        System.out.println("Ogiltig inmatning: skriv ett tal 1-1000");
                                        k++;
                                        continue;
                                    }
                                    int guess3 = Integer.parseInt(input3);
                                    if (guess3 == numberLevel3) {
                                        System.out.println("Grattis! Svaret var: " + numberLevel3);
                                        System.out.println("Du har klarat Nivå 3! BRA JOBBAT!!!");
                                        quitGame = true;
                                        break;
                                    } else if (guess3 < 1) {
                                        System.out.println("För lågt tal. Gissa ett tal mellan 1-1000");
                                        k++;
                                        continue;
                                    } else if (guess3 > 1000) {
                                        System.out.println("För högt tal. Gissa ett tal mellan 1-1000");
                                        k++;
                                        continue;
                                    } else if (k == 0) {
                                         System.out.println("GAME OVER! Rätt svar: " + numberLevel3);
                                         quitGame = true;
                                         break;
                                    } else if (guess3 < numberLevel3) {
                                        System.out.println("För lågt! Försök kvar: " + k);
                                    } else {
                                        System.out.println("För högt! Försök kvar: " + k);
                                    }
                                }
                            } else if (keepGoing.equalsIgnoreCase("Nej")) {
                                System.out.println("Spelet avslutas!");
                                quitGame = true;
                                break;
                            }else{
                            System.out.println("Ogiltig inmatning: Tolkar svar som (NEJ)");
                            quitGame = true;
                            break;
                            }
                        } else if (guess2 < 1) {
                            System.out.println("För lågt tal. Gissa ett tal mellan 1-100");
                            j++;
                            continue;
                        } else if (guess2 > 100) {
                            System.out.println("För högt tal. Gissa ett tal mellan 1-100");
                            j++;
                            continue;
                        } else if (j == 0) {
                            System.out.println("GAME OVER! Rätt svar: " + numberLevel2);
                            quitGame = true;
                            break;
                        }else if (guess2 < numberLevel2) {
                            System.out.println("För lågt! Försök kvar: " + j);
                        } else {
                            System.out.println("För högt! Försök kvar: " + j);
                        }
                    }
                    } else if (keepGoing.equalsIgnoreCase("Nej")) {
                        System.out.println("Spelet avslutas!");
                        quitGame = true;
                         break;
                    }else {
                        System.out.println("Ogiltig inmatning: Tolkar svar som (NEJ) ");
                        quitGame = true;
                        break;
                      }
            }else if(guess1 < 1){
                      System.out.println("För lågt tal. Gissa ett tal mellan 1-50");
                      i++;
                      continue;
            } else if(guess1 > 50){
             System.out.println("För högt tal. Gissa ett tal mellan 1-50");
             i++;
             continue;
            } else if (i == 0) {
                System.out.println("GAME OVER! Rätt svar: "+numberLevel1);
                break;
            }else if (guess1 < numberLevel1) {
                System.out.println("För lågt! Försök kvar: "+i);
            }else {
                System.out.println("För högt! Försök kvar: "+i);
            }


        } sc.close();



    }

}
