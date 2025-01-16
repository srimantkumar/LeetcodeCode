package OneDimensionalArrayProblems;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,8,6,1,1,1,1,9};
        System.out.println(consecutiveOnes(array));
    }

    public static int consecutiveOnes(int[] intArray) {
        int count = 0;
        int finalCount = 0;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] == 1) {
                count++;
            }
            else {
                if(finalCount < count)
                    finalCount = count;
                count = 0;
            }

        }
        if(finalCount < count)
            finalCount = count;
        return finalCount;
    }
}
