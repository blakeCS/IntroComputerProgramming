/** This function is an example of how loops can be used to reduce the number of repeated lines of code. 
  * 
  * 
  * You should take some time to play with the code.  Try changing the following items, and then 
  * compiling and running your program after each one:
  * 1. Change the loop so that it counts from 1 to 50.
  * 2. Change the loop so it counts by 5's.
  * 3. What happens if at line 23 you add the code System.out.println(i); ? **Why?**
  * 
  * 
  * @author Madeline Burton
  * @version 1.0
  * @since 2.01.2018
  */
  
public class ForLoop{

    public void run(){
        // A loop which prints the integer i 10 times.
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        
    }


  //Ignore this code-----------------------------------------------------------------------------------------------
  public static void main(String args[]){
  ForLoop test = new ForLoop();
  test.run();
  }

}
