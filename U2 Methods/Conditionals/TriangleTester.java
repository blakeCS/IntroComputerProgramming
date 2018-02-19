import junit.framework.TestCase;

public class TriangleTester extends TestCase {
  

/** Tests method triangleType for all possible solutions including ints and doubles
 */
  public void testTriangleType() {
  Triangle a = new Triangle();
  
  assertEquals("symmetric", a.triangleType(4, 3, 4));
  assertEquals("irregular", a.triangleType(4, 3, 1));
  assertEquals("regular", a.triangleType(4, 4, 4));
  assertEquals("not a triangle", a.triangleType(4, 3, 0));
  assertEquals("regular", a.triangleType(400, 400, 400));
  assertEquals("irregular", a.triangleType(10, 3, 4.5));
  assertEquals("symmetric", a.triangleType(4.7, 8, 4.7));
  }
  
}
