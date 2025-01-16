package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static void main(String[] args) {
        getRow(6).forEach( i ->
            System.out.println(i)
        );
    }

    static int[][] matrix;
    public static List<Integer> getRow(int rowIndex) {
        matrix = new int[rowIndex + 1][rowIndex + 1];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            result.add(helperFunction(rowIndex, i));
        }
        return result;
    }


    private static Integer helperFunction(int i, int j) {
        if (i < 0 || j < 0)
            return 0;
         if (j == 0 || j == i) {
             matrix[i][j] = 1;
             return 1;
         }
         else if (matrix[i][j] != 0)
             return matrix[i][j];
         else {
             int val = helperFunction(i - 1, j - 1) + helperFunction(i - 1, j);
             matrix[i][j] = val;
             return val;
         }
    }
}
