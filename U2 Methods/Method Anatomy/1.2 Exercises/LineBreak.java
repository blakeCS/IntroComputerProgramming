/** This class is an exercise to play with the possible outputs of the System.out.println method as well as calling
  * new methods.  
  * 
  * You should take some time to play with the code.  Try changing the following items, and then 
  * compiling and running your program after each one:
  * 1. Adding another println to printLineBreak with another string.
  * 2. Calling printLineBreak before and after each "Part" line.
  * 3. Trying to create a third matching "Part 3".
  * 
  * @author Madeline Burton
  * @version 1.0
  * @since 1.24.2018
  */
public class LineBreak implements Runnable //You do not need to know the keyword "implements" for this exercise
{
  
  /**This method runs the program in the console.  It allows us to create output without working with the 
    * interactions pannel. Everything we want to happen when we click "run" must be included here.
    */
  public void run()
  {
    
    System.out.println("Part 1");      //The beginning of the print statement
    printLineBreak();                  //a call to a new function, printLineBreak 
    
    System.out.println("Part 2");      //repeat with part2
    printLineBreak();                  //Call the same function, printLineBreak
  }
  
  
  /** This method was created to avoid dupliacte code.  It creates a line of == followed by another line of **
    */
  private void printLineBreak()
  {
    System.out.println("==========");
    System.out.println("**********");
  }
  
  //Ignore this code-----------------------------------------------------------------------------------------------
  public static void main(String args[]){
  LineBreak l = new LineBreak();
  l.run();
  }
} 
