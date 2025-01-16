package OutsideQuestions;

public class StringRecursions {
    public static void main(String[] args) {
        System.out.println(palindromeString("kayak"));
    }

    static String reverseString(String input) {
        if(input.isEmpty())
            return input;

        return reverseString(input.substring(1)) + input.charAt(0);
    }

    static boolean palindromeString(String input) { //kayak
        //System.out.println(input.length());
        if(input.length() == 0 || input.length() == 1)
            return true;

        else if (input.charAt(0) == input.charAt(input.length() - 1))
            return palindromeString(input.substring(1, input.length() - 1));

        else
            return false;
    }
}
