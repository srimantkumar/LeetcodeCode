package OneDimensionalArrayProblems;

import java.util.Arrays;

public class ArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,48,7,8,4,6,3,13,42,57};
        Arrays.stream(sortArrayByParity(nums)).forEach(i -> System.out.print(i + "\t"));
    }

    static int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length -1, temp;
        while (i < j) {
            if((nums[i] % 2 != 0) && (nums[j] % 2 == 0)) {  //odd, even
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
            } else if ((nums[i] % 2 != 0) && (nums[j] % 2 != 0)) { // odd, odd
                j--;
            } else if ((nums[i] % 2 == 0) && (nums[j] % 2 != 0)) {  //even , odd
                i++;
                j--;
            } else if ((nums[i] % 2 == 0) && (nums[j] % 2 == 0)) { // even, even
                i++;
            }
        }
        return nums;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
