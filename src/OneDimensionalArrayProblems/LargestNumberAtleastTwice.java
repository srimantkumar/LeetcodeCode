package OneDimensionalArrayProblems;

public class LargestNumberAtleastTwice {
    public static void main(String[] args) {
        int[] nums = {3,6,1,0,20,8,12};
        System.out.println(dominantIndex(nums));
    }

    static int dominantIndex(int[] nums) {
        int max  = nums[0];
        int position = 0;
        for(int i = 0; i < nums.length; i++) {
            if ((max < nums[i])) {
                max = nums[i];
                position = i;

            }
        }

        for (int num : nums) {
            if (num != nums[position] && num * 2 > nums[position])
                return -1;
        }
        return position;
    }
}
