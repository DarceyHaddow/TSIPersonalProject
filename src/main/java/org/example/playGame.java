package org.example;

import java.util.Scanner;

public class playGame extends hangman{
    public static void startGame(String word, String word1)
    {
        Scanner input = new Scanner(System.in);
        // total guesses
        int guess_ = 0;

        // number of wrong guesses
        int wrong = 0;

        // for each guess
        String guess;

        // stores the guessed letter
        char letter;

        // stores if the letter was
        // already guessed
        boolean guessescontainsguess;
        String guesses = "";
        boolean guessinword;

        // while loop starts here
        while (wrong < 7 && word1.contains("_")) {

            System.out.println(word1 + "\n");
            int temp =  7 - wrong;
            if (wrong != 0) {

                // for picture 1
                System.out.println("You have " + temp
                        + " guesses left.");

            }

            System.out.print("Your Guess:");

            // takes guess input
            guess = input.nextLine();

            // converts to uppercase
            // for comparison
            guess = guess.toUpperCase();

            // gets the first letter
            // as guessed letter
            letter = guess.charAt(0);

            guessescontainsguess
                    = (guesses.indexOf(letter)) != -1;

            // stores every letter
            // guessed in guesses
            guesses += letter;

            // converts to uppercase for
            // comparison
            letter = Character.toUpperCase(letter);
            System.out.println();

            // if letter already guessed
            if (guessescontainsguess == true) {

                // already guessed letter
                System.out.println("You ALREADY guessed "
                        + letter + ". \n");
            }

            // guessed letter is in the word
            guessinword = (word.indexOf(letter)) != -1;

            // if statement begins
            if (guessinword == true) {

                // print the letter
                System.out.println(
                        letter + " is present in the word.");
                System.out.print("\n");

                // find the letter positions
                // replace dashes with those
                // letter at valid positions
                for (int position = 0;
                     position < word.length(); position++) {

                    // guessed letter is equal to
                    // letter at position in word
                    // and word1 has previously does not
                    // have that letter
                    if (word.charAt(position) == letter
                            && word1.charAt(position)
                            != letter) {

                        word1 = word1.replaceAll("_ ", "_");
                        String word2;
                        word2 = word1.substring(0, position)
                                + letter
                                + word1.substring(position
                                + 1);
                        word2 = word2.replaceAll("_", "_ ");
                        word1 = word2;
                    }
                }
            }

            // if statement ends, else if begins
            else {

                // prints
                // wrong = wrong + 1, after every
                // wrong answer
                System.out.println(
                        letter
                                + " is not present in the word.");
                wrong++;
                
                if (wrong == 1){
                    System.out.println("--------------");
                    System.out.println(" |        ");
                    System.out.println(" |        ");
                    System.out.println(" |       ");
                    System.out.println(" |        ");
                    System.out.println(" |       ");
                    System.out.println(" |      ");
                    System.out.println(" |");
                } else if (wrong == 2) {
                    System.out.println("--------------");
                    System.out.println(" |        |");
                    System.out.println(" |        O");
                    System.out.println(" |        ");
                    System.out.println(" |         ");
                    System.out.println(" |       ");
                    System.out.println(" |      ");
                    System.out.println(" |");
                } else if (wrong == 3) {
                    System.out.println("--------------");
                    System.out.println(" |        |");
                    System.out.println(" |        O");
                    System.out.println(" |        |");
                    System.out.println(" |        | ");
                    System.out.println(" |       ");
                    System.out.println(" |      ");
                    System.out.println(" |");
                } else if (wrong == 4) {
                    System.out.println("--------------");
                    System.out.println(" |        |");
                    System.out.println(" |        O");
                    System.out.println(" |       /|");
                    System.out.println(" |      / | ");
                    System.out.println(" |      ");
                    System.out.println(" |      ");
                    System.out.println(" |");
                } else if (wrong == 5) {
                    System.out.println("--------------");
                    System.out.println(" |        |");
                    System.out.println(" |        O");
                    System.out.println(" |       /|\\");
                    System.out.println(" |      / | \\");
                    System.out.println(" |       ");
                    System.out.println(" |      ");
                    System.out.println(" |");
                } else if (wrong == 6) {
                    System.out.println("--------------");
                    System.out.println(" |        |");
                    System.out.println(" |        O");
                    System.out.println(" |       /|\\");
                    System.out.println(" |      / | \\");
                    System.out.println(" |       / ");
                    System.out.println(" |      /   ");
                    System.out.println(" |");
                }
            }

            // guess_ = guess_ + 1, after every
            // attempt
            guess_++;

        } // while loop ends

        // if the lifelines finishes
        if (wrong == 7) {
            System.out.println("--------------");
            System.out.println(" |        |");
            System.out.println(" |        O");
            System.out.println(" |       /|\\");
            System.out.println(" |      / | \\");
            System.out.println(" |       / \\");
            System.out.println(" |      /   \\");
            System.out.println(" |");
            System.out.println(
                    "YOU LOST!, maximum limit of incorrect guesses reached.");
        }
        else {

            // when solved
            System.out.print(
                    "The word is: " + word1
                            + "\n Well Played, you did it!!");
        }
    }

}
