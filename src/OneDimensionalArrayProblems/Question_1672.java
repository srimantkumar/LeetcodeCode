package OneDimensionalArrayProblems;

import java.util.Arrays;

public class Question_1672 {

    public static void main(String[] args) {
        int[][] accounts = {{2,8,7}, {7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    static public int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        for(int i=0; i < accounts.length; i++) {
            for(int j=0; j< accounts[i].length; j++) {
                wealth[i] += accounts[i][j];
            }
        }
        return  Arrays.stream(wealth).max().getAsInt();
    }
}
