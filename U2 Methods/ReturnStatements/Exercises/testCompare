import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class testCompare extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testSameDigit() {
    Compare c = new Compare();
    
    assertEquals(true, c.sameDigit(2,22));
    assertEquals(false, c.sameDigit(2,21));
    assertEquals(true, c.sameDigit(215,35));
    assertEquals(false, c.sameDigit(110,223));
    assertEquals(true, c.sameDigit(10845,135));
    assertEquals(false, c.sameDigit(0,11));
    
    
  }
  
}
