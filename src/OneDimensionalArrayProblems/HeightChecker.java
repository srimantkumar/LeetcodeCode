package OneDimensionalArrayProblems;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr  = {1,1,0,0,4,2,1,3,0,0,45,90,23,16,67}; //{5,1,2,3,4,8};
        System.out.println(heightChecker(arr));
    }

    static int heightChecker(int[] heights) {
        int[] temp = heights.clone();
        int count = 0;
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != temp[i])
                count++;
        }
        return count;
    }

    static int heightChecker1(int[] heights) {
        int ans = 0;
        int currentHeight = 1;
        int[] count = new int[101];

        for (int height : heights)
            ++count[height];

        for (int height : heights) {
            while (count[currentHeight] == 0)
                ++currentHeight;
            if (height != currentHeight)
                ++ans;
            --count[currentHeight];
        }

        return ans;
    }
}
