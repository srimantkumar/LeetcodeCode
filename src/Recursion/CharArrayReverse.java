package Recursion;

public class CharArrayReverse {
    public static void main(String[] args) {
        char[] str = {'d', 'f', 'r', 't', 'a', 'i'};
        reverseStringRecursive(str);
        System.out.println(str);
    }

    public static void reverseStringRecursive(char[] str) {
        helperFunction(str, 0, str.length - 1);
    }

    private static void helperFunction(char[] str, int si, int ei) {
        if (si < ei) {
            char temp;
            temp = str[si];
            str[si] = str[ei];
            str[ei] = temp;
            helperFunction(str, si + 1, ei -1);
        }
    }

    public static void reverseStringNonRecursive(char[] str) {
        int si = 0;
        int ei = str.length - 1;
        char temp;
        while (si < ei) {
            temp = str[si];
            str[si] = str[ei];
            str[ei] = temp;
            si++;
            ei--;
        }
    }
}
