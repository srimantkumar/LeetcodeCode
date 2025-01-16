package OneDimensionalArrayProblems;

public class Question_1342 {

    public static void main(String[] args) {
        int n = 32;
        System.out.println(numberOfStepsBitwise(n));
    }

    static public int numberOfSteps(int num) {
        int counter = 0;
        while (num > 0) {
            if(num % 2 == 0)
            {
                num /= 2;
                counter ++;
            }
            else {
                num -= 1;
                counter++;
            }
        }
        return  counter;
    }

    static public int numberOfStepsBitwise(int num) {
        int counter = 0;
        while (num > 0) {
            if(num % 2 == 0)
                num >>= 2;
            else
                num--;

            counter++;
        }
        return  counter;
    }

}
