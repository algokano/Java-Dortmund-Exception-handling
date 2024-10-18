public class ChainedExceptionHandling {

    public void chainExceptions() throws Exception {
        try {
            throw new Exception("Inner Exception");
        } catch (Exception e) {
            throw new Exception("Outer Exception", e);
        }
    }
}
