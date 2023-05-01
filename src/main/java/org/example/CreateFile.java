package org.example;


import java.io.File;
import java.io.IOException;


public class CreateFile extends Hangman{
    public static String createFile() {
        try {
            File myObj = new File("words.txt");
            if (myObj.createNewFile()) {
                String word = WriteFile.writeFile(myObj);
                return word;
            } else {
                String word = ReadFile.readFile(myObj);
                return word;
            }
        } catch (IOException e) {
            return ("An error occurred when creating the file that supports " +
                    "the word selection in hangman.");
        }
    }
    }

