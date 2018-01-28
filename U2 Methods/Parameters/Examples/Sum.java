/** This class is an exercise to play with methods that include multiple parameters
  * 
  * You should take some time to play with the code.  Try changing the following items; 
  * compiling and running your program after each one:
  * 1. Change the values of the arguments of sum on line 15 and 16.
  * 2. Add another method call to the run method.
  * 3. Add a third parameter so that sum accepts three ints and adds them together.
  * Make sure to update the comment and method call to match.
  * 
  * @author Madeline Burton
  * @version 1.0
  * @since 1.24.2018
  */
public class Sum {
    public void run() {
        sum(2, 2);
        sum(10, 400);
    }
    
    /** Yields: the sum of a + b to the console
     *  @param a: The first value to be added
     *  @param b: The second value to be added */
    private void sum(int a, int b) {
        int total = a + b;
        System.out.println(total);
    }
    
    
    
    
//Ignore this code-----------------------------------------------------------------------------------------------
  public static void main(String args[]){
  Sum a = new Sum();
  a.run();
  }    
    
}
