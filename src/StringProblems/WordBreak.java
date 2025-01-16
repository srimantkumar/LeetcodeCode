package StringProblems;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        String  s = "cars";
        List<String> wordDict = new ArrayList<>() {
            {
                add("car");
                add("ca");
                add("rs");
            }
        };
        System.out.println(wordBreak(s, wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        for (String str : wordDict) {
            if (s.contains(str))
                s = s.replace(str, "");
        }
        if (s.isEmpty())
            return true;

        return false;
    }

//    public static boolean wordBreak(String s, List<String> wordDict) {
//        int i = 0;
//        while (s.length() > i) {
//            if (wordDict.contains(s.substring(0, i)))
//
//        }
//    }
}
