package org.example;
/* CODE FOR READING FROM THE FILE NEEDS MODIFYING,
ALWAYS RETURNS FIRST LINE
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class createFile extends hangman{
    public static String createFile() {
        try {
            File myObj = new File("words.txt");
            if (myObj.createNewFile()) {
                String[] company = { "Alien", "Potato", "System",
                        "Dulcet", "Toyota" };

                    FileWriter myWriter = new FileWriter("words.txt");
                    for (int i = 0; i < company.length; i++){
                        myWriter.write(company[i] + "\n");
                    }
                    myWriter.close();
                    Scanner myReader = new Scanner(myObj);
                    Random obj = new Random();
                    int Ran_num = obj.nextInt(4);
                    int counter = 0;
                    String word = "";
                    while (myReader.hasNextLine()) {
                        //System.out.println(myReader.nextLine());
                        while (counter == Ran_num){

                            word = myReader.nextLine();
                        }
                        counter += 1;
                    }
                    myReader.close();
                    return word;

                //System.out.println("File created: " + myObj.getName());
                } else {
                Scanner myReader = new Scanner(myObj);
                Random obj = new Random();
                int Ran_num = obj.nextInt(22);
                int counter = 0;
                String word = "";
                while (myReader.hasNextLine()) {
                    //System.out.println(myReader.nextLine());
                    if (counter == Ran_num){

                        word = myReader.nextLine();
                        return word;
                    }
                    counter += 1;
                }
                myReader.close();
                return word;

                //String word = readFile.readFile();
                //return word;
                //call class to read from file
                //System.out.println("File already exists.");
            }
        } catch (IOException e) {
            //System.out.println("error at creating the file");
            return ("An error occurred when creating the file that supports " +
                    "the word selection in hangman.");
        }
    }
    }

