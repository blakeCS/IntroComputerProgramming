import org.junit.*;
import java.io.*;

/**
 * A JUnit test case class for Add10 Exercise.
 * @author Madeline Burton
 * @version 2.0
 * @since 1.28.18
 */
public class Add10Tester
{
  
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

  //collect all output in to a list
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
  public void testAdd10() 
  {
    Add10 a = new Add10();
    a.run();
    
    //Separate output in to a string array
    String output = outContent.toString();
    String[] lines = output.split("\n");
    
    //Check each element in array
    Assert.assertEquals("11", lines[0]);
    Assert.assertEquals("110", lines[1]);
    Assert.assertEquals("-40", lines[2]);
  }
  
}
