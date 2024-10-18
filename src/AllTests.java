import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({MultipleExceptionHandlingTest.class, RethrowExceptionHandlingTest.class, ResourceManagementTest.class, ChainedExceptionHandlingTest.class})
public class AllTests {
}
