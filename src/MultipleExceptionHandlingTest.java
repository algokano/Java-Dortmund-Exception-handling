import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultipleExceptionHandlingTest {

    @Test
    public void testArrayIndexOutOfBounds() {
        MultipleExceptionHandling handler = new MultipleExceptionHandling();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> handler.handleExceptions(new int[]{1, 2, 3}, 5));
    }

    @Test
    public void testArithmeticException() {
        MultipleExceptionHandling handler = new MultipleExceptionHandling();
        assertThrows(ArithmeticException.class, () -> handler.handleExceptions(new int[]{10, 0}, 1));
    }

    @Test
    public void testValidInput() {
        MultipleExceptionHandling handler = new MultipleExceptionHandling();
        assertDoesNotThrow(() -> handler.handleExceptions(new int[]{10, 20, 30}, 1));
    }

    @Test
    public void testZeroDivision() {
        MultipleExceptionHandling handler = new MultipleExceptionHandling();
        assertThrows(ArithmeticException.class, () -> handler.handleExceptions(new int[]{0}, 0));
    }

    @Test
    public void testNegativeIndex() {
        MultipleExceptionHandling handler = new MultipleExceptionHandling();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> handler.handleExceptions(new int[]{10, 20}, -1));
    }
}
