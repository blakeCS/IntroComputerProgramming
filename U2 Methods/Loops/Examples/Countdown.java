/** This function is an example of how for loops can be used to reduce the number of repeated lines of code. 
  * 
  *   )
  * You should take some time to play with the code.  Try changing the following items, and then 
  * compiling and running your program after each one:
  * 1. Change the loop so that it counts from 1 to 50.
  * 2. Change the loop so it counts by 5's.
  * 3. Is the boolean condition checked before or after the loop completes once?  Create code segment in which 
  *    i is not within the parameters of the boolean to see. (For example, i = 10; boolean: (i < 5)  )
  * 
  * 
  * @author Madeline Burton
  * @version 1.0
  * @since 2.01.2018
  */

public class Countdown{
    public void run()
    {
        int i = 10;
        
        while(i >= 0)
        {
            System.out.println(i);
            i--;
        }
    }
      //Ignore this code-----------------------------------------------------------------------------------------------
  public static void main(String args[]){
  ForLoop test = new ForLoop();
  test.run();
  }

}
