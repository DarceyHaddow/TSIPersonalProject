package org.example;

import java.util.Random;

public class hangman {
    public static void run(){

        System.out.println("******Welcome to HANGMAN GAME******");


        String word = createFile.createFile();
        word = word.toUpperCase();


        String word1 = word.replaceAll("[A-Z]", "_ ");


        System.out.println("let's play the game");
        playGame.startGame(word, word1);
    }

}
