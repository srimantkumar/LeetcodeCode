package StringProblems;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        //String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        //24847893154024981730169397005
        //String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        //526700554598729746900966573811
        String a ="11010";
        String b  = "1101";
        System.out.println(addBinary(a, b));
    }


    static public String addBinary(String first, String second) {
        StringBuilder sb = new StringBuilder();
        int i = first.length() - 1, j = second.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += second.charAt(j--) - '0';
            if (i >= 0) sum += first.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    // This code will work if string length is less than 32 char
    static String addBinary1(String a, String b) {
        BigInteger total = BigInteger.ZERO;
        int sum = 0;
        int c = 0, x;
        double p;
        for (int i = a.length() - 1; i >= 0 ; i--) {
            x = a.charAt(i) - '0';
            p = Math.pow(2, c++);
            sum = (int) (x * p);
            total = total.add(BigInteger.valueOf(sum));
        }
        c= 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            x = b.charAt(i) - '0';
            p = Math.pow(2, c++);
            sum = (int) (x * p);
            total = total.add(BigInteger.valueOf(sum));
        }
        StringBuilder sb = new StringBuilder();
        if(total.signum() == 0)
            sb.append("0");
        else {
            while (total.signum() == 1) {
                sb.append(total.mod(BigInteger.valueOf(2)));
                total = total.divide(BigInteger.valueOf(2));
            }
        }
        return sb.reverse().toString();
    }

}
