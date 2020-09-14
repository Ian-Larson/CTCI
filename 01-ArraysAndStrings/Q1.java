//1.1 isUnique

//Implement an algotrithm to determine if a string has all unique characters.
//What if you cannot use additional data structures?


/*
Approach:
What is the form of the input?
How many unique characters?
What am I returning? Boolean

*/
public class Q1 {
  public static boolean isUnique(String str) {
    if (str.length() > 128) {
      return false;
    }

    boolean chars[] = new boolean[128];
    for (int i = 0; i < str.length(); i++) {
      int check = str.charAt(i);
      if (chars[check]) {
        return false;
      }
      chars[check] = true;
    }
    return true;
  }

  public static void main(String[] args) {
    String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUnique(word));
		}
	}
}
