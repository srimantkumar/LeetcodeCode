package TwoDimensionalArrayProblems;

import java.util.Arrays;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,6,9,19,20},{4,5,6,45,23,31,87},{7,8,9,34,65,76,14},{10,11,12,37,59,7,2},{15,10,12,37,9,71,21}};
        Arrays.stream(stripOrder(mat)).forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        Arrays.stream(findDiagonalOrder(mat)).forEach(j -> System.out.print(j + "\t"));
    }

    //This method for printing matrix in diagonal order in one way(right to left)
    static int[] findDiagonalOrder(int[][] mat) {
        int[] output = new int[mat.length * mat[0].length];
        int index = 0, c = 1;
        int i = 0;
        int j = 0;
        int k, l;
        while (i < mat.length && j < mat[0].length) {
            k = i;
            l = j;
            if(c % 2 == 0) {
                while(l > -1 && k < mat.length) {
                    output[index++] = mat[k][l];
                    l--;
                    k++;
                }
            } else {
                while(k > -1 && l < mat[0].length) {
                    output[index++] = mat[k][l];
                    l++;
                    k--;
                }
            }
            c++;
            if(c % 2 == 0) {
                i = (l >= mat[0].length ? k + 2 : k + 1);
                j = (l < mat[0].length ? l : mat[0].length - 1);
            } else {
                i = (k < mat.length ? k : mat.length - 1);
                j = (k >= mat.length ? l + 2 : l + 1);
            }
        }
        return output;
    }

    //This method for printing matrix in diagonal order in one way(right to left)
    static int[] stripOrder(int[][] mat) {
        int[] output = new int[mat.length * mat[0].length];
        int index = 0;
        int i = 0;
        int j = 0;
        int k, l;
        while (i < mat.length && j < mat[0].length) {
            k = i;
            l = j;
            while(l > -1 && k < mat.length) {
                output[index++] = mat[k][l];
                l--;
                k++;
            }
            if (j == mat[0].length - 1 && k <= mat.length)
                i++;
            if (j < mat[0].length - 1)
                j++;
        }
        return output;
    }
}
