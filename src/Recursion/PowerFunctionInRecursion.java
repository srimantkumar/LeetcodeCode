package Recursion;

public class PowerFunctionInRecursion {
    public static void main(String[] args) {
        new PowerFunctionInRecursion();
    }

    public PowerFunctionInRecursion() {
        double x = 6.0;
        int n = 230;

        System.out.println(Math.pow(x, n));
        System.out.println(myPow(x, n));
    }

    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        double result =  x * myPow(x, n-1);
        if ( result > 10000 || -10000 > result) {
            System.out.println("expected 'x^n' to have value from -10000 to 10000 only");
            return 0;
        }
        else
            return result;
    }
}
