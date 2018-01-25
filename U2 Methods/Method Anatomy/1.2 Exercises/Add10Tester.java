import org.junit.*;
import java.io.*;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class Add10Tester
{
  
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  
  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }
  
  @After
  public void restoreStreams() {
    System.setOut(System.out);
    System.setErr(System.err);
  }
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  @Test
  public void testAdd10() 
  {
    Add10 a = new Add10();
    a.run();
    
    String output = outContent.toString();
    String[] lines = output.split("\n");
    
    Assert.assertEquals("11", lines[0]);
    Assert.assertEquals("110", lines[1]);
    Assert.assertEquals("-40", lines[2]);
  }
  
}
