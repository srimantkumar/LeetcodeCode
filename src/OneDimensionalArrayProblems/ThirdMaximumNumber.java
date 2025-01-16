package OneDimensionalArrayProblems;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};//{1,4,91,2,5,3,1,84,45,19,67,37,54,43,71,98,9,21};
        System.out.println(thirdMax(nums));
    }

    static int thirdMax(int[] nums) {
        Integer M1 = null, M2 = null, M3 = null;
        for (Integer num : nums) {
            if (num.equals(M1) || num.equals(M2) || num.equals(M3))
                continue;

            if (M1 == null || M1 < num ) {
                M3 = M2;
                M2 = M1;
                M1 = num;
            } else if (M2 == null || M2 < num) {
                M3 = M2;
                M2 = num;
            } else if (M3 == null || M3 < num) {
                M3 = num;
            }
        }
        return (M3 != null ? M3 : M1);
    }
}
