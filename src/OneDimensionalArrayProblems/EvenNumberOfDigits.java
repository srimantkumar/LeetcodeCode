package OneDimensionalArrayProblems;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] numArray = {12,345,2,6,7896, 875623, 78787878, 765};
        System.out.println(evenNumberOfDigitsCount(numArray));
    }

    public static int evenNumberOfDigitsCount(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += countDigit(nums[i]);
            //if(Integer.toString(nums[i]).length() % 2 == 0)     count++;
            //if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000)   count++;
        }
        return count;
    }

    public static int countDigit(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        if(count % 2 == 0)
            return 1;
        else
            return 0;
    }
}
