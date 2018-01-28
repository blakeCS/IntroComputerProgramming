import org.junit.*;
import java.io.*;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class MadlibTester
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
  
  @Test
  public void testMadlib() 
  {
    Madlib a = new Madlib();
    a.run();
    
    String output = outContent.toString();
    String[] lines = output.split("\n");
    
    Assert.assertEquals("My fairy godmother says I can't have a cheetah until I am 5" +  
                          " years old and learn to run my Paris and take out the popsicle", lines[0]);

  }
  
}
