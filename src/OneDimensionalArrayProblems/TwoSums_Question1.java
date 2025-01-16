package OneDimensionalArrayProblems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums_Question1 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15, 34, 56, 12, 76};
        Arrays.stream(twoSumHashMap(nums, 91)).forEach(i -> System.out.println(i));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i < nums.length; i++) {
            for (int j=i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int k = target - nums[i];

            if(sumMap.containsKey(k)) {
                int[] result = {i, sumMap.get(k)};
                return result;
            }
            sumMap.put(nums[i], i);
        }
        return  null;
    }
}
