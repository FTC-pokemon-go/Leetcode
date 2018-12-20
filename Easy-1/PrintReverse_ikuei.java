package leetcode;

public class PrintReverse_ikuei {

  public static void main(String[] args) {
      System.out.println(printOut(new String("overload")));
  }
  
  public static String printOut(String s) {
      String reverseString = "";
      char[] chars = s.toCharArray();
      char[] newChars = new char[chars.length];
      for(int i = 0 ; i < chars.length ; i++) {
          char ch = chars[(chars.length - 1 ) - i];
          newChars[i] = ch;
      }
      reverseString = String.valueOf(newChars);
      
      return reverseString;
  }
}

