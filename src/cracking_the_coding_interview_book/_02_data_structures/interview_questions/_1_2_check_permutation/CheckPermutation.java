package cracking_the_coding_interview_book._02_data_structures.interview_questions._1_2_check_permutation;

import java.util.Arrays;

/**
 * Given two strings, write a method to decide if one is a permutation of the other
 **/
public class CheckPermutation {

    public static void main(String[] args) {
        String s = "dog";
        String t = "atr";
        System.out.println("is a permutation?: " + permutation(s, t));
        System.out.println("is a permutation?: " + permutation2(s, t));
    }

    public static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) return false;
        return sort(s).equals(sort(t));
    }

    public static boolean permutation2(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] letters = new int[128]; // assumption ASCII
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i)]--;
            if (letters[t.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
}
