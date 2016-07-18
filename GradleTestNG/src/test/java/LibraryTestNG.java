 
import org.testng.Assert;
import org.testng.annotations.*;
 
public class LibraryTestNG {
 
 @BeforeClass
 public void setUp() {
   // code that will be invoked when this test is instantiated
 }
 
 @Test(groups = { "fast" })
 public void aFastTest() {
   System.out.println("Fast test");
   Library classUnderTest = new Library();
   Assert.assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
 }
 
 @Test(groups = { "slow" })
 public void aSlowTest() {
    System.out.println("Slow test");
 }
 
}
