package OneDimensionalArrayProblems;

import java.util.Arrays;

public class SortingOfSquares {
    public static void main(String[] args) {
        int[] arr = {-7,-4,-3,1,2,3,8,11};
        Arrays.stream(SquareOfSortedArray(arr)).forEach(i -> System.out.print(i+ "\t"));
    }

    public static int[] SquareOfSortedArray1(int[] nums) {
        int[] resultArray = new int[nums.length];
        int front = 0 ;
        int back = nums.length - 1;
        for (int i = back; i >= 0; i-- ) {
            if((nums[front] * nums[front]) > (nums[back] * nums[back])) {
                resultArray[i] = (nums[front] * nums[front]);
                front++;
            }
            else {
                resultArray[i] = (nums[back] * nums[back]);
                back--;
            }
        }
        return resultArray;
    }

    public static int[] SquareOfSortedArray(int[] nums) {
        int[] resultArray = new int[nums.length];
        int j = nums.length - 1, k = j;
        for (int i = 0; i <= j; i++) {
            if(nums[i] * nums[i] > nums[j] * nums[j]) {
                resultArray[k] = nums[i] * nums[i];
                k--;
            } else {
                resultArray[k] = nums[j] * nums[j];
                k--;
                j--;
                i--;
            }
        }
        return resultArray;
    }
}
