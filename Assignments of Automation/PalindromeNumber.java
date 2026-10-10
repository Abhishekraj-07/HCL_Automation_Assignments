import java.util.*;

public class PalindromeNumber {
  public static boolean isPalindrome(int num) {
    String str = String.valueOf(num);
    for (int i = 0; i < str.length() / 2; i++) {
      int n = str.length();
      if (str.charAt(i) != str.charAt(n - 1 - i)) {
        // not a palindrome
        return false;
      }
    }
    return true;

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(isPalindrome(num));
    sc.close();
  }
}
