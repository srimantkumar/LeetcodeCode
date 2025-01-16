package TwoDimensionalArrayProblems;

public class TwoDimensionalTest {
    // "static void main" must be defined in a public class.
        private static void printArray(int[][] a) {
            for (int i = 0; i < a.length; ++i) {
                System.out.println(a[i]);
            }
            for (int i = 0; i < a.length; ++i) {
                for (int j = 0; a[i] != null && j < a[i].length; ++j) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            System.out.println("Example I:");
            int[][] a = new int[4][5];
            printArray(a);
            System.out.println("Example II:");
            int[][] b = new int[2][];
            printArray(b);
            System.out.println("Example III:");
            a[0] = new int[3];
            a[1] = new int[6];
            a[2] = new int[4];
            printArray(a);
        }
}
