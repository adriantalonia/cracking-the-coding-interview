package cracking_the_coding_interview_book._02_arrays_strings._1_6_string_compression;

public class StringCompression {

    public static void main(String[] args) {
        String test = "aabcccccaaa";
        System.out.println("Compress string: " + compress(test));
    }

    private static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
