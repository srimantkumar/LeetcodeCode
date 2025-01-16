package OneDimensionalArrayProblems;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {-1,-1,-1,-1,-1,0,-1,1};//{2,1,-1};//{1,2,3,3};//{1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }

    static int findPivotIndex(int[] nums) {
        int i = 0, j = nums.length - 1;
        int leftSum = nums[i];
        int rightSum = nums[j];
        while(i <= j) {
            if(i == j) {
                if(leftSum == rightSum)
                    return i;
                else
                    return -1;
            }
            else if(Math.abs(leftSum) < Math.abs(rightSum)) {
                leftSum += nums[++i];
            } else /*if(Math.abs(leftSum) > Math.abs(rightSum))*/ {
                rightSum += nums[--j];
            } /*else {
                leftSum += nums[++i];
                rightSum += nums[--j];
            }*/
        }
        return -1;
    }

    static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for (int ele : nums)
            totalSum += ele;

        for (int i = 0; i < nums.length; leftSum += nums[i++])
            if (leftSum * 2 == totalSum - nums[i])
                return i;
        return -1;
    }
}
