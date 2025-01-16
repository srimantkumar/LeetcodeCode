package OutsideQuestions;

public class RecursionInNumber {
    public static void main(String[] args) {
        String binary = "";
        System.out.println(DecimalToBinary(54, binary));
    }

    static String DecimalToBinary(int num, String binary) {
        while (num > 0) {
            binary = num % 2 + binary;
            num /= 2;
            DecimalToBinary(num, binary);
        }
        return binary;
    }
}
