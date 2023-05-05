# TSIPersonalProject
This respository contains the game hangman and the tests/doubles for this game.
The master branch of this repository contains the project and tests. Please look at the commits for the master branch rather than the main!

The hangman game is played using the terminal. To start the game run Main.

# Tests
* Class: CreateFileTest contains 2 unit tests for the CreateFile Class.
* Class: WriteFileTest contains 1 unit test for the WriteFile Class.
* Class: ReadFileTest contains 1 mock for the ReadFile Class. This class has an external call.
* Class: PlayGametest contains 4 doubles (including a mock, a stub and a fake) for the PlayGame Class.

# Strategy Design Pattern
* The Interface is called Strategy
* Classes, GuessesContainsGuess and GuessNotInWord, contain implementations of Strategy
* Class, Context, contains the setters and getters needed to pick (an execute) a given strategy
* Both strategies are used in the class PlayGame
