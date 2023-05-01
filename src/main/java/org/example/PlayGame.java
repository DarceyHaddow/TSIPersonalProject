package org.example;

import java.util.Scanner;

public class PlayGame extends Hangman {
    public static String startGame(String word, String word1) {
        Scanner input = new Scanner(System.in);
        int guess_ = 0;
        int wrong = 0;
        String guess;
        char letter;
        boolean guessesContainsGuess;
        String guesses = "";
        boolean guessInWord;


        while (wrong < 7 && word1.contains("_")) {

            System.out.println(word1 + "\n");
            int temp = 7 - wrong;
            if (wrong != 0) {
                System.out.println("You have " + temp + " guesses left.");
            }

            System.out.print("Your Guess:");

            guess = input.nextLine();
            guess = guess.toUpperCase();

            letter = guess.charAt(0);

            guessesContainsGuess = (guesses.indexOf(letter)) != -1;

            guesses += letter;

            letter = Character.toUpperCase(letter);
            System.out.println();

            if (guessesContainsGuess == true) {
                System.out.println("You ALREADY guessed " + letter + ". \n");
            }

            guessInWord = (word.indexOf(letter)) != -1;

            if (guessInWord == true) {
                String[] wordList = letterInWord(letter, word, word1);
                word = wordList[0];
                word1 = wordList[1];
            } else {
                System.out.println(letter + " is not present in the word.");
                wrong++;
                System.out.println(generateHangmanSymbol(wrong));
            }
            guess_++;

        }

        if (wrong == 7) {
            return ("YOU LOST!, maximum limit of incorrect guesses reached.\n" +"The word was: " + word);
        } else {
            return ("The word is: " + word1 + "\n Well Played, you did it!!");
        }
    }

    public static String generateHangmanSymbol(int wrong) {
        if (wrong == 1) {
            return("--------------\n" + " |        \n" + " |        \n" + " |       \n" +
                    " |      \n" + " |      \n" + " |      \n" + " |");
        } else if (wrong == 2) {
            return("--------------\n" + " |        |\n" + " |        O\n" + " |         \n" +
                    " |          \n" + " |       \n" + " |      \n" + " |");
        } else if (wrong == 3) {
            return("--------------\n" + " |        |\n" + " |        O\n" + " |        |\n" +
                    " |        | \n" + " |       \n" + " |      \n" + " |");
        } else if (wrong == 4) {
            return("--------------\n" + " |        |\n" + " |        O\n" + " |       /|\n" +
                    " |      / | \n" + " |       \n" + " |      \n" + " |");
        } else if (wrong == 5) {
            return("--------------\n" + " |        |\n" + " |        O\n" + " |       /|\\\n" +
                    " |      / | \\\n" + " |        \n" + " |         \n" + " |");
        } else if (wrong == 6) {
            return("--------------\n" + " |        |\n" + " |        O\n" + " |       /|\\\n" +
                    " |      / | \\\n" + " |       / \n" + " |      /   \n" + " |");
        } else if (wrong == 7) {
            return("--------------\n" + " |        |\n" + " |        O\n" + " |       /|\\\n" +
                    " |      / | \\\n" + " |       / \\\n" + " |      /   \\\n" + " |");
        }
        return("");
    }

    public static String[] letterInWord(char letter, String word, String word1) {
        System.out.println(letter + " is present in the word.");
        System.out.print("\n");
        String[] returnWords = {"","","is present in the word"};

        for (int position = 0; position < word.length(); position++) {

            if (word.charAt(position) == letter && word1.charAt(position) != letter) {
                word1 = word1.replaceAll("_ ", "_");
                String word2;
                word2 = word1.substring(0, position)
                        + letter
                        + word1.substring(position
                        + 1);
                word2 = word2.replaceAll("_", "_ ");
                word1 = word2;
                returnWords[0] = word;
                returnWords[1] = word1;
            }
        }
        return returnWords;
    }

}



