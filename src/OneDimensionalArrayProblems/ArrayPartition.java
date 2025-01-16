package OneDimensionalArrayProblems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};//{39,19,18,9,7,5,3,2};
        System.out.println(arrayPairSum(nums));
    }

    static int arrayPairSum(int[] nums) {
        Arrays.sort(new int[][]{nums}, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums));
        int i = 1, sum = 0;
        while(i < nums.length) {
            sum += nums[i];
            i += 2;
        }
        return sum;
    }

    static int arrayPairSum1(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); // 2, 3, 5, 7, 9, 18, 19, 39
        int i = nums.length - 2, sum = 0;
        while(i >= 0) {
            sum += nums[i];
            i -= 2;
        }
        return sum;
    }
}
