package OneDimensionalArrayProblems;

import java.util.Arrays;

public class DuplicateOccurrencesOfZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,5,6,0,5};
        duplicateZeros(arr);
        Arrays.stream(arr).forEach(i -> System.out.print(i+ "\t"));
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 2; j >= i; j--)
                    arr[j+1] = arr[j];
                ++i;
                if(i < arr.length)
                    arr[i] = 0;
            }
        }
    }
}
