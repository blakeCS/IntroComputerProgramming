public class InstanceScope { 
    private String instanceVariable = "Hello! I'm an instance variable!";
    private int counter = 0; 
  
    public void run() {
        System.out.println("instanceVariable exists throughout the entire class.");
        System.out.println();
        
        System.out.println("instanceVariable exists in run: " + this.instanceVariable);
        this.counter++;
        System.out.println("Counter: " + this.counter);
        
        foo();
        bar();
    }
    
    public void foo() {
        System.out.println("and in foo: " + this.instanceVariable);
        this.counter++;
        System.out.println("Counter: " + this.counter);
    }
    
    public void bar() {
        System.out.println("and in bar: " + this.instanceVariable);
        this.counter++;
        System.out.println("Counter: " + this.counter);
    }
    
  //Ignore this code-----------------------------------------------------------------------------------------------
  public static void main(String args[]){
  InstanceScope a = new InstanceScope();
  a.run();
  }
}
