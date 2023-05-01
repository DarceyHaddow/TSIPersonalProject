import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WriteFileTest {
    @Test
    void writeFileFunctionality() throws IOException {
        File testFile = new File("testFile.txt");
        FileWriter myWriter = new FileWriter(testFile);
        myWriter.write("Alien");
        myWriter.close();
        Scanner myReader = new Scanner(testFile);
        assertEquals("Alien", myReader.nextLine());

    }
}
