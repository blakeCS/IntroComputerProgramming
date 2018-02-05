public class LocalScope {
    String check = "running...";
    public void run(){
        parameterScope("Hello World!");
        // Point A
        System.out.println();
        
        method1();
        method2();
        System.out.println();
        
        forLoopScope();
    }
    
    // The parameter is in scope for the entirety of the method
    public void parameterScope(String parameter){
        // Point B
        System.out.println("parameter exists throughout the entire method");
        System.out.println(check);
        System.out.println(parameter);
    }
    
    // The variable `local` in method1 is completely
    // different from the variable `local` in method2
    public void method1(){
        // local does not exist yet
        
        String local = "method1's local variable";
        
        // now local exists
        
        System.out.println(local);
    }
    
    // The variable `local` in method1 is completely
    // different from the variable `local` in method2
    public void method2(){
        // local does not exist yet
        
        String local = "method2's local variable";
        
        // now local exists
        System.out.println(local);
        //Point C
    }
    
    // Variables declared inside of a for loop only exist inside
    // of the for loop.
    public void forLoopScope(){
        System.out.println(check);
        System.out.println("i does not exist before the loop.");
        
        for(int i = 0; i < 3; i++)
        {
            // Point D
            System.out.println("i exists inside the loop: " + i);
        }
        
        System.out.println("i does not exist after the loop");
    }
    
  //Ignore this code-----------------------------------------------------------------------------------------------
  public static void main(String args[]){
  LocalScope a = new LocalScope();
  a.run();
  }
}
