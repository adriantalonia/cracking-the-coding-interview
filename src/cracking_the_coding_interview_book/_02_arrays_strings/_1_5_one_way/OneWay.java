package cracking_the_coding_interview_book._02_arrays_strings._1_5_one_way;

public class OneWay {

    public static void main(String[] args) {
        String original1 = "pale";
        String remove = "ple";
        System.out.println("s1: "+original1+", s2: "+remove+" -> remove = "+oneEditWay(original1, remove));

        String original2 = "pales";
        String remove2 = "pale";
        System.out.println("s1: "+original2+", s2: "+remove2+" -> remove2 = "+oneEditWay(original2, remove2));

        String original3 = "pale";
        String replace = "bale";
        System.out.println("s1: "+original3+", s2: "+replace+" -> replace = "+oneEditWay(original3, replace));

        String original4 = "pale";
        String errorCase = "bae";
        System.out.println("s1: "+original4+", s2: "+errorCase+" -> errorCase = "+oneEditWay(original4, errorCase));

    }

    private static boolean oneEditWay(String first, String second) {
        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditInsert(second, first);
        }
        return false;
    }

    private static boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;

        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
}
