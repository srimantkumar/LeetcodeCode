package OneDimensionalArrayProblems;

import java.util.Arrays;

public class TwoSum_II {
    public static void main(String[] args) {
        int[] numbers = {2,7, 11, 15};
        System.out.println(Arrays.toString(twoSum1(numbers, 9)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    output[0] = i + 1;
                    output[1] = j + 1;
                    return output;
                }
            }
        }
        return output;
    }

    //Optimal
    static int[] twoSum1(int[] numbers, int target) {
        int i = numbers.length - 1, j = 0;
        while (i > j) {
            if(numbers[j] + numbers[i] == target) {
                return new int[] {j+1,i+1};
            } else if (numbers[j] + numbers[i] > target) {
                i--;
            } else {
                j++;
            }
        }
        return new int[] {-1,-1};
    }
}
