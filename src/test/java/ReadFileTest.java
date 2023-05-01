import org.example.CreateFile;
import org.example.ReadFile;
import org.example.WriteFile;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReadFileTest extends ReadFile {
    @Test
    void readFileFunctionality() throws IOException {
        File myObj = new File("testFile.txt");
        FileWriter myWriter = new FileWriter("testFile.txt");
        myWriter.write("Alien" + "\n");
        myWriter.close();
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.hasNextLine()).thenReturn(true);
        when(mockScanner.nextLine()).thenReturn("Alien");
        String word = ReadFile.readFile(myObj);
        assertEquals("Alien", word);

    }
}
