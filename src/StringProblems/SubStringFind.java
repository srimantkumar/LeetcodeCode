package StringProblems;

public class SubStringFind {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeee";
        strStr(haystack, needle);
    }

    static int strStr(String haystack, String needle) {
        int c = haystack.indexOf(needle);
        System.out.println(c);
        return c;
    }
}
