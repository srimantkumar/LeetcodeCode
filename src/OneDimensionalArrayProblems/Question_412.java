package OneDimensionalArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class Question_412 {

    public static void main(String[] args) {
        int n = 32;
        System.out.println(fizzBuzz(n));;
    }

    public static List<String> fizzBuzz(int n) {
        List<String> resultArray = new ArrayList<>();
        for(int i=1; i <= n; i++) {
            if((i % 3) == 0 && (i % 5) == 0)
                resultArray.add("FizzBuzz");
            else if((i % 3) == 0)
                resultArray.add("Fizz");
            else if ((i % 5) == 0) {
                resultArray.add("Buzz");
            }
            else
                resultArray.add(String.valueOf(i));
        }

        return  resultArray;
    }
}
