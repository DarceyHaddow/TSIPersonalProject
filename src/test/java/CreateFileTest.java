import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateFileTest {
    @Test
    void mockCreateFileFunctionality() throws IOException {
        File mockFile = mock(File.class);
        assertEquals(false, mockFile.exists());
    }
    @Test
    void createFileFunctionality() {
        File myObj = new File("testCreateFile.txt");
        assertEquals(false, myObj.exists());
    }

}
