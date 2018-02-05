public class MathOperations{ 
    private double PI = 3.14159;
    
    public void run(){
        int sumResult = sum(5, 10);
        int differenceResult = difference(20, 2);
        double productResult = product(3.5, 2);
        double circumferenceResult = circleCircumference(10);
        double areaResult = circleArea(12);
    }
    
    public int sum(int one, int two){
        // Printing Variables Example
        System.out.println("PI: " + PI);
        System.out.println("one: " + one);
        System.out.println("two: " + two);
        
        return one + two;
    }
    
    public int difference(int one, int two){
        // PRINT OUT VARIABLES HERE
        
        return one - two;
    }
    
    public double product(double a, double b){
        double result = a * b;
        
        // PRINT OUT VARIABLES HERE
        
        
        return result;
    }
    
    public double circleCircumference(int radius){
        // PRINT OUT VARIABLES HERE
        
        
        return 2 * radius * PI;
    }
    
    public double circleArea(int radius){
        double area = PI * radius * radius;
        
        // PRINT OUT VARIABLES HERE
        
        return area;
    }
    
  //Ignore this code-----------------------------------------------------------------------------------------------
  public static void main(String args[]){
  InstanceScope a = new InstanceScope();
  a.run();
  }
}
