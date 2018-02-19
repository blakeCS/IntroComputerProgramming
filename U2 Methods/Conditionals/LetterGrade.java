/**In this example, a method has been written to determine a student’s letter grade based on their percent.  
  * Unfortunately, this code segment does not work.  You should:
  * 1. Play with the code to identify a few percent grades that are giving an incorrect numeric grade.
  * 2. Fix the code:  To do this, you should NOT rewrite any code.  
  *     Instead, copy and paste to move the conditional statements in to the correct order such that they work correctly.
  * 
  * Your code will NOT be accepted if it uses alternative conditions.
  */


public class LetterGrade{
    
    public void run(){
        //Call the method getGrade a few times here to find out hwo it works.

      
    }
    
    /**Method to determine grade
      * @param score: The student's grade in a percent written as an int
      * Grades including partial credit (doubles) will be truncated to the nearest int
      */
    public void getGrade(int score){
      if (score < 60){
        System.out.println("You get a F");
      }
      else if (score >=60){
        System.out.println("You get a D");
      }
      else if (score >=70){
        System.out.println("You get a C");
      }
      else if (score >=80){
        System.out.println("You get a B");
      }
      else if (score >=90){
        System.out.println("You get an A");
      }
    }
    
    
  //Ignore this code-----------------------------------------------------------------------------------------------
  public static void main(String args[]){
  LetterGrade a = new LetterGrade();
  a.run();
  }
}
