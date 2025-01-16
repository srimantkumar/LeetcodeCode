package OneDimensionalArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums =  {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }

    //Time Complexity O(N + M)
    //Space Complexity O(N)
    static int removeElement1(int[] nums, int val) {
        List<Integer> num = new ArrayList<>();
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                num.add(nums[i]);
                j++;
            }
        }
        for (int i = 0; i < num.size(); i++) {
            nums[i] = num.get(i);
        }
        Arrays.stream(nums).forEach(id -> System.out.print(id + "\t"));
        System.out.println();
        return num.size();
    }

    //Time Complexity O(N)
    //Space Complexity O(1)
    static int removeElement(int[] nums, int val) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[left++] = nums[i];
            }
        }
        Arrays.stream(nums).forEach(id -> System.out.print(id + "\t"));
        return left;
    }
}


