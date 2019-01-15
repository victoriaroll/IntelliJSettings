#parse("File Header.java")
package ${PACKAGE_NAME};
import org.junit.*;
import static org.junit.Assert.*;

public class ${NAME} {

    @Before
    public void EveryTestStartup() {
        //Code to run before each test method
        //System.out.println("Each test startup");
    }

    @After
    public void EveryTestCleanup() {
        //Code to run after each test method
        //System.out.println("Each test cleanup");
    }

    @BeforeClass
    public static void TestStartup() {
        //Code to run before each set of tests in the test class
        //System.out.println("Before all test startup");
    }

    @AfterClass
    public static void TestCleanup() {
        //Code to run after each set of tests in the test class
        //System.out.println("After all test finish");
    }

    @Test
    public void testOK() {
        Assert.assertEquals(1, 1);
    }

    @Test(expected = Exception.class)
    public void testExpectedFail() throws Exception {
        throw new Exception("Expected failure");
    }
    @Test
    public void testFailFully(){
        Assert.assertFalse(true);
    }
}