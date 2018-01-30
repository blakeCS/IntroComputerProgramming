import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class testTen extends TestCase {

  public void testX() {
    Ten x = new Ten();
    assertEquals(x.makes10(4,5), false);
    assertEquals(x.makes10(2,9), false);
    assertEquals(x.makes10(10,5), true);
    assertEquals(x.makes10(4,10), true);
    assertEquals(x.makes10(13,5), false);
    assertEquals(x.makes10(4,6), true);
  }
  
}
