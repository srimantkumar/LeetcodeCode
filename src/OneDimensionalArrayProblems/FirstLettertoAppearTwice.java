package OneDimensionalArrayProblems;

import java.util.HashMap;

public class FirstLettertoAppearTwice {

    public static void main(String[] args) {
        String s = "srsikkantkumarmohanty";
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (int i=0; i < s.length(); i++) {
            //char c = s.charAt(i);
            if(countMap.containsKey(s.charAt(i))) {
                return s.charAt(i);
            }

            countMap.put(s.charAt(i), 1);
        }
        return ' ';
    }
}
