/** Create a method, triangleType, that given three values representing the lengths of three sides of a triangle, 
  * determine whether the triangle is:
  * regular (all three sides are equal), 
  * symmetric (two sides are equal), 
  * or irregular (no two sides are equal). 
  * 
  * If one side is zero, your method should identify it with the phrase "not a triangle".  
  * 
  * In your solution, you MUST use at least one boolean operator.
  */

public class Triangle{
  
  public void run(){
    System.out.println(triangleType(1,2,3));
    System.out.println(triangleType(50, 30, 50));
    System.out.println(triangleType(4, 6, 0));
    System.out.println(triangleType(2, 2, 2));
    System.out.println(triangleType(160, 400, 400));
      
    }
    
    /** Write your method triangleType here.  Make sure to include appropriate javadoc comments as well!
      */

    
    
  //Ignore this code-----------------------------------------------------------------------------------------------
  public static void main(String args[]){
  Triangle a = new Triangle();
  a.run();
  }
}
