//1.2 Check Permutation
//Given two strings, write a method to decide if one is a Permutation of the other
//Approach:Count the character values

public class Q2 {
  public static boolean permutation(String s, String t) {
    if (s.length() != t.length()) return false;

    int[] charValues = new int[128];

    for (int i = 0; i < s.length; i++) {
      charValues[i] = s.charAt[i];
    }
  }
}
