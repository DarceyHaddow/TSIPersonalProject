package org.example;
/* CODE FOR READING FROM THE FILE NEEDS MODIFYING,
ALWAYS RETURNS FIRST LINE
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class createFile extends hangman{
    public static String createFile() {
        try {
            File myObj = new File("words.txt");
            if (myObj.createNewFile()) {
                String word = writeFile.writeFile(myObj);
                return word;
                //System.out.println("File created: " + myObj.getName());
                } else {
                Scanner myReader = new Scanner(myObj);
                int counter = 0;
                String word = "";
                ArrayList listOfWords = new ArrayList();
                while (myReader.hasNextLine()) {
                    listOfWords.add(myReader.nextLine());
                    counter += 1;
                }
                Random obj = new Random();
                int Ran_num = obj.nextInt(counter);
                word = (String) listOfWords.get(Ran_num);
                myReader.close();
                return word;
            }
        } catch (IOException e) {
            //System.out.println("error at creating the file");
            return ("An error occurred when creating the file that supports " +
                    "the word selection in hangman.");
        }
    }
    }

