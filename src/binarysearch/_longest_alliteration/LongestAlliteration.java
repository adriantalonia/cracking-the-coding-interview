package binarysearch._longest_alliteration;

public class LongestAlliteration {

    public static int solve(String[] words) {
        int sublistStart = 0;
        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < words.length; i++) {
            char startLetter = words[sublistStart].charAt(0);
            char currentLetter = words[i].charAt(0);

            if (startLetter == currentLetter) {
                currentLength = i - sublistStart + 1;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
                sublistStart = i;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String[] words = {"pennsylvania", "jarfly", "quimper", "acouophonia", "chemis", "subequally", "nace", "hyperchlorhydria", "calk", "unsponged", "independence"};

        System.out.println(solve(words));
    }
}
