package org.example;

public class GuessNotInWord implements Strategy{

    public String execute(boolean guessesContainsGuess, char letter){
        String output = letter + " is not present in the word.";
        return output;
    }
}
