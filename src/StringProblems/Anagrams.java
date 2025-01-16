package StringProblems;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"}; // 1 < strs 10^4
        System.out.println(groupAnagrams(strs));
    }
 // O(n)
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        Map<String, List<String>> counter = new HashMap<>();

        for (String s: strs) {
            String key = stringSorting(s);
            if (!counter.containsKey(key)) {
                counter.put(key, new ArrayList<>());
            }
            counter.get(key).add(s);
        }


        for (Map.Entry<String, List<String>> entry : counter.entrySet()) {
            output.add(entry.getValue());
        }

        return output;
    }

    public static String stringSorting(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
