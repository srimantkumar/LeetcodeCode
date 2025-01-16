package OneDimensionalArrayProblems;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums  = {-1, 2};
        int k = 3;
        rotateArray(nums, k);
    }

    static void rotate(int[] nums, int k) {
        int temp  = nums[0], temp1;
        for (int i = 0; i < k; i++) {
            for (int j = 1; j < nums.length; j++) {
                temp1 = nums[j];
                nums[j] = temp;
                temp  = temp1;
            }
            nums[0] = temp;
        }
        Arrays.stream(nums).forEach(i -> System.out.print(i + "\t"));
    }

    static void rotateExtraSpace(int[] nums, int k) {
        int i = 0;
        int[] resultArray = new int[nums.length];
        for (int j = k; j < nums.length; j++) {
            resultArray[j] = nums[i++];
        }

        for (int l = 0; l < k; l++) {
            resultArray[l] = nums[i++];
        }
        Arrays.stream(resultArray).forEach(item -> System.out.print(item + "\t"));
    }

    static void rotateArray(int[] nums, int k) {
        k %= (nums.length);
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        Arrays.stream(nums).forEach(i -> System.out.print(i + "\t"));
    }

    static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
