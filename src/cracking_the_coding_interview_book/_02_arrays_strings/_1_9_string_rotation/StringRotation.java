package cracking_the_coding_interview_book._02_arrays_strings._1_9_string_rotation;

public class StringRotation {

    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";

        if (areRotations(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean areRotations(String str1, String str2)
    {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
        return (str1.length() == str2.length()) &&
                ((str1 + str1).contains(str2));
    }
}
