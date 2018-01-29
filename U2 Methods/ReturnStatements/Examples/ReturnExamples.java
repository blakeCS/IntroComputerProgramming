/** This class includes multiple simple methods which each contain input parameters and return statements.
  * 
  * You should take some time to play with the code.  As you do, consider the following questions:
  * 1. Version 1, 2, and 3 all print a the result of the sum method to the screen.  All three do it in differnt ways.
  *    What are the pros/cons of each statement?
  * 2. It is helpful to create a print statement prior to testing which alerts the programmer to what is being run.
  *    Add a print statement before VERSION 1 calling out what you are printing/testing (similar to line 33.)
  * 3. Generally, we avoid using extra variables if possible.  Revise the method sum to remove the variable total.
  * 
  * @author Madeline Burton
  * @version 1.0
  * @since 1.29.2018
  */

public class ReturnExamples {
  public void run() {
    
    //VERSION 1
    //Define a variable result1, then give it a value. then print result.
    int result1;
    result1 = sum(10, 38);
    System.out.println(result1);
    
    //VERSION 2
    //Create a variable, result, and initialize it to the sum of 2 + 5, then print it
    int result2 = sum(2, 5);
    System.out.println(result2);
    
    //VERSION 3
    //Alternatively, we don't *need* to use a variable result if we don't need to store the information.
    //We can print the sum in the println method.
    System.out.println(sum(10, 20));
    
    
    //Print alert statement
    System.out.println("Testing Add10 Method");
    
    int y = add10(5);
    System.out.println(y);
    
    System.out.println(add10(10));
    
    System.out.println("Testing Double Number");
    int multiplied = multiply(10, 4);
    System.out.println(multiplied);
  }
  
  private int multiply(int x, int y)
  {
    return x * y;
  }
  
  private int add10(int x)
  {
    return x + 10;
  }
  
  private int sum(int a, int b)
  {
    //Merge the next two lines in to a single line of code that returns the sum of a and b.
    int total = a + b;
    return total;
  }
  
  
  //Ignore this code-----------------------------------------------------------------------------------------------
  public static void main(String args[]){
    ReturnExamples a = new ReturnExamples();
    a.run();
  }
}
