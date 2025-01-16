package Recursion;


import java.util.Arrays;

public class DecodeWays {

    public static void main(String[] args) {
        new DecodeWays();
    }

    // s = "11106"

    public DecodeWays() {
        String s = "13251123344325147462373232";
        System.out.println(numDecoding(s));
        System.out.println(MyNumDecoding(s));
    }

    // bottom-up approach
    int[] memo;
    public int MyNumDecoding(String s) {
        memo = new int[s.length() + 1];
        Arrays.fill(memo, -1);
        return decodeWays(s, 0);
    }

    public int decodeWays(String s, int index) {
        if (index == s.length())
            return 1;
        if (memo[index] != -1)
            return memo[index];
        if (s.charAt(index) == '0')
            return 0;

        int ways;
        ways = decodeWays(s, index+1);
        if (index + 1 < s.length() && Integer.parseInt(s.substring(index, index + 2)) <= 26)
            ways += decodeWays(s, index+2);
        memo[index] = ways;
        return ways;
    }

    // top-down approach
    public static int numDecoding(String s) {
        int n=s.length() ;
        int[] dp=new int[n+1] ;
        dp[n]=1;
        for(int i = n-1 ; i >= 0 ; i--)
            if(s.charAt(i)!='0')
            {
                dp[i] = dp[i+1] ;
                if(i < n-1 && (s.charAt(i)=='1' || s.charAt(i)=='2' && s.charAt(i+1)<'7'))
                    dp[i]+=dp[i+2];
            }

        return dp[0];
    }
}
