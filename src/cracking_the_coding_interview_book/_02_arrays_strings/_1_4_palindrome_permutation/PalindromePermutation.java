package cracking_the_coding_interview_book._02_arrays_strings._1_4_palindrome_permutation;

public class PalindromePermutation {

    public static void main(String[] args) {
        String test = "Tact Coa";
        String test2 = "abb";
        System.out.println("isPermutationOfPalindrome Tact Coa: " + isPermutationOfPalindrome(test));
        System.out.println("isPermutationOfPalindrome abb: " + isPermutationOfPalindrome(test2));

        System.out.println("isPermutationOfPalindrome2 Tact Coa: " + isPermutationOfPalindrome2(test));
        System.out.println("isPermutationOfPalindrome2 abb: " + isPermutationOfPalindrome2(test2));
    }

    /*
     * Solution #1 O(N) N = phrase length
     * */
    public static boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFrequency(phrase);
        return checkMaxOneOdd(table);
    }

    private static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    private static int[] buildCharFrequency(String phrase) {
        // ASCII z = 122, a = 97 = 25
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }

    private static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    /*
     * Solution #2
     * */

    private static boolean isPermutationOfPalindrome2(String phrase) {
        if(phrase.length() == 3) return phrase.charAt(0) == phrase.charAt(2);
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if (table[x] != 1 && table[x] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }
}
