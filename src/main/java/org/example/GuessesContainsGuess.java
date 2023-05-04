package org.example;

public class GuessesContainsGuess implements Strategy{

    public String execute(boolean guessesContainsGuess, char letter){
        String output = "You ALREADY guessed " + letter + ". \n";
        return output;
    }
}
