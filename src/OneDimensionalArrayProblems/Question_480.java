package OneDimensionalArrayProblems;

import java.util.Arrays;

public class Question_480 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 7, 8};
        Arrays.stream(nums).forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        int[] result = runningSum(nums);
        Arrays.stream(result).forEach(i -> System.out.print(i + "\t"));
    }

    public static int[] runningSum(int[] nums) {
        //int[] runningSum = new int[nums.length];
        //runningSum[0] = nums[0];
        for(int i=1; i < nums.length ; i++) {
            //runningSum[i] = runningSum[i-1] + nums[i];
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }

}
