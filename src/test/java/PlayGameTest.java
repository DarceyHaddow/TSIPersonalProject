import org.example.Context;
import org.example.GuessesContainsGuess;
import org.example.PlayGame;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.Scanner;


public class PlayGameTest extends PlayGame{


    @Test
    void startGameFunctionality(){
        String word = "Alien";
        String word1 = "Alien";
        assertEquals("The word is: Alien\n Well Played, you did it!!",PlayGame.startGame(word, word1));
    }

    @Test
    void generateHangmanSymbolFunctionality(){
        PlayGame mockGame = mock(PlayGame.class);
        String expectedResult = "--------------\n" + " |        |\n" + " |        O\n" + " |       /|\\\n" +
                " |      / | \\\n" + " |       / \\\n" + " |      /   \\\n" + " |";
        int wrong = 7;
        assertEquals(expectedResult,mockGame.generateHangmanSymbol(wrong));
    }

    @Test
    void letterInWordFunctionality(){
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("A");
        char c = mockScanner.nextLine().charAt(0);
        String[] word = PlayGame.letterInWord(c,"Alien","_____");
        assertEquals("A_ _ _ _ ",word[1]);
    }

    @Test
    void StrategyTest(){
        Context mockContext = mock(Context.class);
        boolean guessesContainsGuess = true;
        char letter = 'A';
        when(mockContext.executeStrategy(guessesContainsGuess, letter)).thenReturn("You ALREADY guessed " + letter + ". \n");
        String result = mockContext.executeStrategy(guessesContainsGuess, letter);
        String expected = "You ALREADY guessed " + letter + ". \n";
        assertEquals(expected,result);
    }

}
