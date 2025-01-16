package OneDimensionalArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,9,9,9,9};
        Arrays.stream(plusOne(digits)).forEach(i -> System.out.print(i + "\t"));
    }

    static int[] plusOne1(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] + carry > 9) {
                list.add(0);
                carry =1;
            } else {
                list.add(digits[i] + carry);
                carry = 0;
            }
        }
        if (carry == 1)
            list.add(1);

        int[] result = new int[list.size()];
        int k = list.size() - 1;
        for (int num : list) {
            result[k--] = num;
        }
        return result;
    }

    static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] + carry > 9) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] += carry;
                carry = 0;
            }
        }

        if (carry == 1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }
}

//Time Complexity = O(N + N + N)
//Space Complexity = O(N + N)
