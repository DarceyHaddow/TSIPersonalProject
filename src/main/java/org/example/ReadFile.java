package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ReadFile extends CreateFile{
    public static String readFile(File myObj) throws FileNotFoundException {
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


}
