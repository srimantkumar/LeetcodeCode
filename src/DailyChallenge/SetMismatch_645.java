package DailyChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SetMismatch_645 {
    public static void main(String[] args) {
        new SetMismatch_645();
    }

    public SetMismatch_645() {
        int[] nums = { 1,5,3,2,2,7,6,4,8,9 };
        for(int n : findErrorNums(nums))
            System.out.println(n);
    }

    public int[] findErrorNums(int[] nums) {
        //Arrays.sort(nums);
        int expectedSum = (nums.length * (nums.length + 1)) / 2;
        int actualSum = 0;
        Map<Integer, Integer> hashTable = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
            if (result[0] == 0 && hashTable.containsKey(nums[i])) {
                result[0] = nums[i];
            }
            else
                hashTable.put(nums[i], i);
        }
        result[1] = expectedSum - (actualSum - result[0]);
        return result;
    }
}
