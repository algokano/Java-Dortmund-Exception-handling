public class RethrowExceptionHandling {

    public void rethrowException() throws Exception {
        try {
            throw new Exception("Original Exception");
        } catch (Exception e) {
            System.out.println("Handling and rethrowing exception");
            throw e;
        }
    }
}
