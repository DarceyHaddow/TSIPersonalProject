package org.example;

import java.util.Random;

public class hangman {
    public static void run(){
        // array of strings containing words
        String[] company = { "Alien", "Potato", "System",
                "Dulcet", "Toyota" };
        System.out.println("    Welcome to HANGMAN GAME    ");

        Random obj = new Random();
        int Ran_num = obj.nextInt(5);

        // takes input of the word
        String word = (company[Ran_num]);
        word = word.toUpperCase();

        // To show the word in underscores
        String word1 = word.replaceAll("[A-Z]", "_ ");

        // play the game
        System.out.println("let's play the game");
        playGame.startGame(word, word1);
    }

}
