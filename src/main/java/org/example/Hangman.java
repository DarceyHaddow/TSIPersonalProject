package org.example;

public class Hangman {
    public static void run(){

        System.out.println("--------------\n" + " |        |\n" + " |        O\n" + " |       /|\\\n" +
                " |      / | \\\n" + " |       / \\\n" + " |      /   \\\n" + " |");



        System.out.println("******Welcome to HANGMAN GAME******");


        String word = CreateFile.createFile();
        word = word.toUpperCase();


        String word1 = word.replaceAll("[A-Z]", "_ ");


        System.out.println("let's play the game");

        String gameResult = PlayGame.startGame(word, word1);
        System.out.println(gameResult);

    }

}
