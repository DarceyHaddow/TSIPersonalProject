package org.example;

public class Hangman {
    public static void run(){

        System.out.println("******Welcome to HANGMAN GAME******");


        String word = CreateFile.createFile();
        word = word.toUpperCase();


        String word1 = word.replaceAll("[A-Z]", "_ ");


        System.out.println("let's play the game");
        PlayGame.startGame(word, word1);
    }

}
