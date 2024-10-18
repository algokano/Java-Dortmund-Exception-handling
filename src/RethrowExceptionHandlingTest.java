import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RethrowExceptionHandlingTest {

    @Test
    public void testRethrowException() {
        RethrowExceptionHandling handler = new RethrowExceptionHandling();
        Exception exception = assertThrows(Exception.class, handler::rethrowException);
        assertEquals("Original Exception", exception.getMessage());
    }

    @Test
    public void testHandlingBeforeRethrow() {
        RethrowExceptionHandling handler = new RethrowExceptionHandling();
        assertDoesNotThrow(() -> {
            try {
                handler.rethrowException();
            } catch (Exception e) {
                System.out.println("Handled and rethrown.");
            }
        });
    }

    @Test
    public void testExceptionPropagation() {
        RethrowExceptionHandling handler = new RethrowExceptionHandling();
        assertThrows(Exception.class, handler::rethrowException);
    }

    @Test
    public void testRethrowDifferentException() {
        RethrowExceptionHandling handler = new RethrowExceptionHandling();
        assertThrows(Exception.class, () -> {
            try {
                handler.rethrowException();
            } catch (Exception e) {
                throw new IllegalStateException("Different exception", e);
            }
        });
    }

    @Test
    public void testNoExceptionCaught() {
        RethrowExceptionHandling handler = new RethrowExceptionHandling();
        assertThrows(Exception.class, handler::rethrowException);
    }
}
