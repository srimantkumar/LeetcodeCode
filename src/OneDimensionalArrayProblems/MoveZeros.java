package OneDimensionalArrayProblems;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1,0,4,5,0,0,6,6,0,12};
        moveZeroes(nums);
    }

    static void moveZeroes(int[] nums) {
        int j  = 0, temp;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                if (nums[j] != nums[i])
                    j = i;
            }
            else {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        Arrays.stream(nums).forEach(i -> System.out.print(i + "\t"));
        System.out.println();
    }

    static void moveZeroesNew(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for(int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        Arrays.stream(nums).forEach(i -> System.out.print(i + "\t"));
    }
}
