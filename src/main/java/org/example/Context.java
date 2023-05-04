package org.example;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(boolean guessesContainsGuess, char letter) {
        return strategy.execute(guessesContainsGuess, letter);
    }

}
