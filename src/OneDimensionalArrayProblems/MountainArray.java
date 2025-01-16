package OneDimensionalArrayProblems;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,8,4,2,1};//{3,5,5};//{9,8,7,6};//{0,3,2,1};//{0,2,3,4,5,2,1,0};
        System.out.println(validCheck(arr));
    }

    static boolean validMountainArray(int[] arr) {
        int incrementCounter = 0, decrementCounter = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] < arr[i] && decrementCounter == 0) {
                incrementCounter++;
            } else if (arr[i-1] > arr[i] && incrementCounter > 0) {
                decrementCounter++;
            } else {
                return false;
            }
        }
        return incrementCounter > 0 && decrementCounter > 0;
    }

    static boolean validCheck(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int difference = arr[1] - arr[0];

        // Decreasing or not strictly increasing from the beginning itself
        if (difference <= 0) {
            return false;
        }

        for (int i = 1; i < arr.length; i++) {
            if (difference > 0) {
                // Positive until current iteration
                difference = arr[i] - arr[i-1];
                if (difference == 0) {
                    // 2 consecutive elements having the same value.
                    // Invalid
                    return false;
                }
            } else if (difference == 0) {
                // Zero until current iteration
                // Not allowed (2 consecutive elements had the same value)
                return false;
            } else {
                // Negative until current iteration
                difference = arr[i] - arr[i-1];
                if (difference >= 0) {
                    // Change from negative (decreasing) to zero or positive (increasing)
                    // Invalid
                    return false;
                }
            }
        }

        return difference < 0;
    }
}
