/** This class is an exercise for you to work with methods.  
  * 
  * You will need to:
  * 1. Finish DEFINING the methods printJ and printA to draw the letters J and A with the * character
  * 2. CALL the methods in the Run procedure.
  * 3. Compile and Run the program to output JAVA vertically, in ascii, to your console.
  * 
  * @author Madeline Burton
  * @version 1.0
  * @since 1.24.2018
  */
public class PrintJava{
  public void run()
  {
    
    printJ();
    System.out.println();
    printA();
    // Complete the function calls to print the rest of the letters
    
  }
  
  private void printJ()
  {
    // Fill this in
  }
  
  private void printA()
  {
    // Fill this in
  }
  
  private void printV()
  {
    System.out.println("*   *");
    System.out.println("*   *");
    System.out.println(" * * ");
    System.out.println("  *  ");
  }

  
//Ignore this code-----------------------------------------------------------------------------------------------
  public static void main(String args[]){
  PrintJava m = new PrintJava();
  m.run();
  }
}
