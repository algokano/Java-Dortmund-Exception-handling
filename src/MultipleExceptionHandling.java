public class MultipleExceptionHandling {

    public void handleExceptions(int[] numbers, int index) {
        try {
            System.out.println("Number at index: " + numbers[index]);
            int result = 100 / numbers[index];
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
