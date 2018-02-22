public class Palindromes{
  /**
   * This program lets the user input some text and
   * prints out whether or not that text is a palindrome.
   */
  public void run(){
    //Change this string to test whether your palindrome function works.
    String text = "kayak";
    isPalindrome(text);

  }
  
  /**
   * This method takes the result from isPalindrome (a boolean) 
   * and outputs a statement to the user in the console.
   * 
   * @param isSame The result of whether a piece of text is a palindrome.
   */
  public void toUser(boolean isSame){
    if(isSame){
      System.out.println("Your word is a palindrome!");
    } else {
      System.out.println("Not a palindrome :(");
    }
  }
  /**
   * This method determines if a String is a palindrome,
   * which means it is the same forwards and backwards.
   * 
   * @param text The text we want to determine if it is a palindrome.
   * @return A boolean of whether or not it was a palindrome.
   */
  private void isPalindrome(String text){
    String reversed = reverse(text);
    if(text.equals(reversed)) {
       toUser(true);
    } else {
       toUser(false);
    }
  }
  
  /**
   * This method reverses a String.
   * 
   * @param text The string to reverse.
   * @return The new reversed String.
   */
  private String reverse(String text) {
    String result = "";
    for(int i = text.length() - 1; i >= 0; i--){
      char cur = text.charAt(i);
      result += cur;
    }
    return result;
  }
  
  // IGNORE THIS CODE ----------------------------------
  public static void main (String args[]){
  Palindromes p = new Palindromes();
  p.run();
  }
}
