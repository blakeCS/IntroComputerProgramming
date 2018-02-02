import org.junit.*;
import java.io.*;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class Print500Tester{
  
 
  
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
  
  @Test
  public void print500Tester() {
    
    Print500 test = new Print500();
    test.run();
    
    String output = outContent.toString();
    String[] lines = output.split("\n");
    
    Assert.assertEquals("I will not throw paper airplanes in class",lines[0]);
    Assert.assertEquals(lines.length, 500);
  }
  
}
