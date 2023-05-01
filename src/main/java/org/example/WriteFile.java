package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile extends Hangman{
    public static String writeFile(File words){

        String[] company = { "Alien", "Potato", "System",
                "Dulcet", "Toyota", "Abyss", "Bubbly", "Buzz",
                "Buff", "Cozy", "Fluff", "Fluffy", "Fizz",
                "Fizzy", "Fox", "Jinx", "Lucky", "Puff",
                "Puffy", "Puzzle", "Quiz", "Shabby", "Zippy" };

        try {
            FileWriter myWriter = new FileWriter("words.txt");
            for (int i = 0; i < company.length; i++){
                myWriter.write(company[i] + "\n");
            }
            myWriter.close();
            String word = ReadFile.readFile(words);
            return word;
        } catch (IOException e) {
            return("An error occurred when writing to the file that supports " +
             "the word selection in hangman.");
        }
    }
}
