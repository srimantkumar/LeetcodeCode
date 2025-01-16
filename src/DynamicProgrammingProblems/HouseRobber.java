package DynamicProgrammingProblems;

public class HouseRobber {
    public static void main(String[] args) {
        new HouseRobber();
    }

    public HouseRobber() {
        int[] nums = {123, 23, 2, 76, 56, 345, 187, 257, 9, 98, 167, 289, 371};
        System.out.println(robs(nums));
    }

    // This uses top-down approach as it goes from array end to start
    public int rob(int[] nums) {
        return rob (nums, nums.length - 1);
    }

    public int rob(int[] nums, int i) {
        if (i < 0)
            return 0;

        return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
    }

    // This uses bottom-up approach as it goes from array start to end
    public int robs(int[] nums) {
        if (nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        return prev1;
    }
}
