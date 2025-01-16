package DailyChallenge;

import java.util.*;

public class UniqueCharacter_1239 {
    public static void main(String[] args) {
        new UniqueCharacter_1239();
    }

    public UniqueCharacter_1239() {
        String[] arr = {"un","iq","iqge"};
        System.out.println(maxLength(Arrays.stream(arr).toList()));
    }

    public int maxLength(List<String> arr) {
        return backtrack(arr, "", 0);
    }

    public int backtrack(List<String> arr, String current, int index) {
        if(!isUnique(current))
            return 0;

        int maxLength = current.length();

        for (int i = index; i < arr.size(); i++) {
            maxLength = Math.max(maxLength, backtrack(arr, current + arr.get(i), i + 1));
        }
        return maxLength;
    }

    public boolean isUnique(String str) {
        Set<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if(!charSet.add(c))
                return false;
        }
        return true;
    }
}
