package OneDimensionalArrayProblems;

import java.util.HashMap;

public class IfDoubleExist {
    public static void main(String[] args) {
        int[] arr = {0,11,10,-19,4,6,-8};
        System.out.println(isExist(arr));
    }

    static boolean isExist(int[] arr) {
        HashMap<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (table.containsValue(2 * arr[i]) || (arr[i] % 2 == 0 && table.containsValue(arr[i] / 2))) {
                return true;
            }
            table.put(i, arr[i]);
        }
        return false;
    }
}
