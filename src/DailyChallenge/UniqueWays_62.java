package DailyChallenge;

public class UniqueWays_62 {
    public static void main(String[] args) {
        new UniqueWays_62();
    }

    public UniqueWays_62() {
        System.out.println(factorial(5));
        int m = 5;
        int n = 12;
        System.out.println(uniquePaths(m, n));
    }

    public int uniquePaths(int m, int n) {
        return (factorial(m+n-2)/(factorial(m-1) * factorial(n-1)));
//        int[][] dp = new int[m][n];
//        return dpApproach(m-1, n-1, dp);
    }

    public int factorial(int n) {
        int mul = 1;
        for(int i = 1; i <= n; i++) {
            mul *= i;
        }
        return mul;
    }

    public int dpApproach(int i, int j, int[][] dp) {
        if (i == 0 && j == 0)
            return 1;
        if (i < 0 || j < 0)
            return 0;
        if (dp[i][j] != 0)
            return dp[i][j];

        int up = dpApproach(i-1, j, dp);
        int left = dpApproach(i, j-1, dp);
        return dp[i][j] = up + left;
    }
}
