package Recursion;


public class KthSymbolGrammar {
    public static void main(String[] args) {
        int n = 29;
        int k = 136;
        System.out.println(kthGrammarIterative(n, k));
    }

    public static int kthGrammarIterative(int n, int k) {
        String[] arr = new String[n];
        arr[0] = "0";

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1].concat(reverseBits(arr[i-1]));
        }
        return Integer.parseInt(String.valueOf(arr[n-1].charAt(k-1)));
    }

    public static String reverseBits(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Iterate through the character array
        for (int i = 0; i < charArray.length; i++) {
            // Reverse each bit
            if (charArray[i] == '0') {
                charArray[i] = '1';
            } else if (charArray[i] == '1') {
                charArray[i] = '0';
            }
        }

        // Convert the character array back to a string
        return new String(charArray);
    }

    public static int kthGrammarRecursive(int n, int k) {
        return depthFirstSearch(n, k, 0);
    }

    private static int depthFirstSearch(int n, int k, int rootVal) {
        if (n == 1)
            return rootVal;

        int totalNodes = (int) Math.pow(2, n-1);

        // Target node will be present in the right half sub-tree of the current root node.
        if (k > (totalNodes / 2)) {
            int nextRootVal = (rootVal == 0) ? 1 : 0;
            return depthFirstSearch(n - 1, k - (totalNodes / 2), nextRootVal);
        }
        // Otherwise, the target node is in the left sub-tree of the current root node.
        else {
            int nextRootVal = (rootVal == 0) ? 0 : 1;
            return depthFirstSearch(n - 1, k, nextRootVal);
        }
    }


}
/**
 * 0
 * 01
 * 0110
 * 01101001
 * 0110100110010110
 * 01101001100101101001011001101001
 *
 */
