package OneDimensionalArrayProblems;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,};//{0,0,1,1,1,2,2,3,3,4,8,9,9,11};
        System.out.println(removeDuplicateElements(nums));
    }

    static int removeDuplicateElements(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }
        Arrays.stream(nums).forEach(id -> System.out.print(id + "\t"));
        System.out.println();
        return ++index;
    }
}
