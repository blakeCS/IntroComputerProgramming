import org.junit.*;
import java.io.*;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class DivisibleTester{
  
  
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
  public void testDivisible() {
    Divisible test = new Divisible();
    test.run();
    
    String output = outContent.toString();
    String[] lines = output.split("\n");
    
    //Test all things divisible by 5
    for(int i = 5; i<=100; i+=5){
     Assert.assertEquals((i + ": true"),lines[i-1]); 
    }
 
    //Test all things not divisible by 5
    for(int i = 1; i<=100; i+=5){
     Assert.assertEquals((i + ": false"),lines[i-1]); 
    }
    for(int i = 2; i<=100; i+=5){
     Assert.assertEquals((i + ": false"),lines[i-1]); 
    }
    for(int i = 3; i<=100; i+=5){
     Assert.assertEquals((i + ": false"),lines[i-1]); 
    }
    for(int i = 4; i<=100; i+=5){
     Assert.assertEquals((i + ": false"),lines[i-1]); 
    }
            
    
  }
  
}
