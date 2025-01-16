package TwoDimensionalArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        spiralOrder(mat).stream().forEach(i -> System.out.print(i + "\t"));

    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralList = new ArrayList<>();
        if(matrix.length == 0)
            return spiralList;

        int rowStart = 0, colStart = 0;
        int rowEnd = matrix.length - 1, colEnd = matrix[0].length - 1;
        while(rowStart <= rowEnd && colStart <= colEnd) {
            //Traverse Right
            for (int i = colStart; i <= colEnd; i++) {
                spiralList.add(matrix[rowStart][i]);
            }
            rowStart++;

            //Traverse Down
            for (int i = rowStart; i <= rowEnd; i++) {
                spiralList.add(matrix[i][colEnd]);
            }
            colEnd--;

            //Traverse Left
            if(rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    spiralList.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            //Traverse Up
            if(colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    spiralList.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return spiralList;
    }
}
