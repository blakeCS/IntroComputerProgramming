/** This function is an example of how parameters can be used to reduce complexity of code by creating
  * functions with multiple uses. 
  * 
  * 
  * You should take some time to play with the code.  Try changing the following items, and then 
  * compiling and running your program after each one:
  * 1. Change the names printed in lines 26 and 27.
  * 2. Add another print statement within the run method to print another name.
  * 3. What happens if you add the following code to line 22: System.out.println(name); **Why?**
  * 4. What happens if you add the following method call within the run statement: printHello(7); **Why?**
  * 
  * @author Madeline Burton
  * @version 1.0
  * @since 1.24.2018
  */
public class Hello {
  
  //Single method for all hello’s
  public void printHello(String name){
    System.out.println("Hello, " + name);
  }

  //Method to run the program.
  public void run(){
   
    printHello("Simba");
    printHello("Timon");
    
    String n = "Pumbaa";
    printHello(n); //Notice that n is NOT the same variable as the parameter name.
    
    
    String name = "Nala";  //We can use the varaible name here, but it does not refer
    printHello(name);      //to the same place in memory as the parameter name above.

  }                   




  //Ignore this code-----------------------------------------------------------------------------------------------
  public static void main(String args[]){
  Hello temp = new Hello();
  temp.run();
  }

}
