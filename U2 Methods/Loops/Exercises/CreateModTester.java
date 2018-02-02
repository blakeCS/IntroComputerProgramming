import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class CreateModTester extends TestCase {
  

  public void testCreateMod() {
    
    CreateMod test = new CreateMod();
    assertEquals(test.modulus(100,5), 100%5);
    assertEquals(test.modulus(10,3), 10%3);
    assertEquals(test.modulus(11,3), 11%3);
    assertEquals(test.modulus(12,3), 12%3);
    
  }
  
}
