package cracking_the_coding_interview_book._02_arrays_strings._1_1_is_unique;

/**
 * Implement an algorithm to determine if a string has all unique characters
 * what if you cannot use additional data structures
 **/

public class IsUnique {

    public static void main(String[] args) {
        String str = "asdfghjkl";
        System.out.println("is unique chars?: " + isUniqueChars(str));
        System.out.println("is unique chars?: " + isUniqueChars2(str));
    }

    public static boolean isUniqueChars(String str) {
        // ASCII
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) { // already found this char in string
                return false;
            }
            char_set[val] = true;
        }

        return true;
    }

    public static boolean isUniqueChars2(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
