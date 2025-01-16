package OneDimensionalArrayProblems;

import java.util.Arrays;

public class greatestElementOnRight {
    public static void main(String[] args) {
        int[] arr = /*{17,18,5,4,6,1};*/ {57010,40840,69871,14425,70605};
        Arrays.stream(elementOnRight(arr)).forEach(i -> System.out.print(i + "\t"));
    }

    /*static int[] elementOnRight(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int max  = arr[i+1];
            for (int j = i+1; j < arr.length; j++) {
                if (max < arr[j])
                    max = arr[j];
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1 ;
        return arr;
    }*/

    static int[] elementOnRight(int[] arr) {
        int temp  = arr[arr.length - 1], max;
        if(arr.length > 1) {
            for (int i = arr.length - 2; i >= 0; i--) {
                max = (temp > arr[i + 1] ? temp : arr[i + 1]);
                temp = arr[i];
                arr[i] = max;
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
