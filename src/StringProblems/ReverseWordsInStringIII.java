package StringProblems;

public class ReverseWordsInStringIII {
    public static void main(String[] args) {
        String s = "God Love everyone";//"Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        int j = 0, k;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                for (k = i - 1; k >= j; k--) {
                    output.append(s.charAt(k));
                }
                output.append(" ");
                j = i + 1;
            } else if (i == s.length() - 1) {
                for (k = i; k >= j; k--) {
                    output.append(s.charAt(k));
                }
            }
        }
        return output.toString();
    }
/*
    static String reverse(String s) {
        return ' '.join(list(map(lambda x : x[::-1], s.split())));
    }*/
}

//Time Complexity: O(N + N)
//Space Complexity: O(1)
