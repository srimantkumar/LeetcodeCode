package StringProblems;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringsInWords {
    public static void main(String[] args) {
        String s = "h   sky is blue     a";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        List<String> stringList = new ArrayList<>();
        int j  = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if ((j - i) > 1)
                    stringList.add(s.substring(i+1, j));
                j = i;
            } else if (i == 0) {
                if ((j - i) > 0)
                    stringList.add(s.substring(i, j));
            }
        }

        StringBuffer result = new StringBuffer();
        stringList.forEach(str -> result.append(str).append(" "));
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}
