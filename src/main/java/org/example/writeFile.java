package org.example;
/* CODE FOR READING FROM THE FILE NEEDS MODIFYING,
ALWAYS RETURNS FIRST LINE
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class writeFile extends hangman{
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
            Scanner myReader = new Scanner(words);
            Random obj = new Random();
            int Ran_num = obj.nextInt(22);
            int counter = 1;
            String word = "";
            while (myReader.hasNextLine()) {
                if (counter == Ran_num){

                    word = myReader.nextLine();
                    return word;
                }
                counter += 1;
            }
            myReader.close();
            return word;
        } catch (IOException e) {
            return("An error occurred when writing to the file that supports " +
             "the word selection in hangman.");
        }
    }
}
