import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChainedExceptionHandlingTest {

    @Test
    public void testChainExceptions() {
        ChainedExceptionHandling handler = new ChainedExceptionHandling();
        Exception exception = assertThrows(Exception.class, handler::chainExceptions);
        assertEquals("Outer Exception", exception.getMessage());
        assertEquals("Inner Exception", exception.getCause().getMessage());
    }

    @Test
    public void testOuterException() {
        ChainedExceptionHandling handler = new ChainedExceptionHandling();
        Exception exception = assertThrows(Exception.class, handler::chainExceptions);
        assertEquals("Outer Exception", exception.getMessage());
    }

    @Test
    public void testInnerException() {
        ChainedExceptionHandling handler = new ChainedExceptionHandling();
        Exception exception = assertThrows(Exception.class, handler::chainExceptions);
        assertEquals("Inner Exception", exception.getCause().getMessage());
    }

    @Test
    public void testExceptionChainingWithNull() {
        ChainedExceptionHandling handler = new ChainedExceptionHandling();
        assertThrows(Exception.class, handler::chainExceptions);
    }

    @Test
    public void testMultipleChaining() {
        ChainedExceptionHandling handler = new ChainedExceptionHandling();
        Exception exception = assertThrows(Exception.class, handler::chainExceptions);
        assertNotNull(exception.getCause());
    }
}
