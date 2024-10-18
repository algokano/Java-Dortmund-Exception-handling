import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;

public class ResourceManagementTest {

    @Test
    public void testReadFile() {
        ResourceManagement resource = new ResourceManagement();
        assertDoesNotThrow(() -> resource.readFile("testfile.txt"));
    }

    @Test
    public void testFileNotFound() {
        ResourceManagement resource = new ResourceManagement();
        assertDoesNotThrow(() -> resource.readFile("nonexistent.txt"));
    }

    @Test
    public void testIOException() {
        ResourceManagement resource = new ResourceManagement();
        assertDoesNotThrow(() -> resource.readFile("corruptedfile.txt"));
    }

    @Test
    public void testReadFileWithEmptyFile() {
        ResourceManagement resource = new ResourceManagement();
        assertDoesNotThrow(() -> resource.readFile("emptyfile.txt"));
    }

    @Test
    public void testResourceClosed() {
        ResourceManagement resource = new ResourceManagement();
        assertDoesNotThrow(() -> resource.readFile("testfile.txt"));
    }
}
