package OneDimensionalArrayProblems;

import java.util.Arrays;
import java.util.Vector;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
        System.out.println(minSubArrayLen(213, nums));
    }

    static int minSubArrayLen(int target, int[] nums) {
        int k = nums.length - 1, sum = 0, count = 0;
        Arrays.sort(nums);
        while(sum < target && k >= 0) {
            sum += nums[k--];
            count++;
        }
        return (sum >= target ? count : 0);
    }
}
