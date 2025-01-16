package OneDimensionalArrayProblems;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2, 15, 31, 71, 81, 0, 0, 0, 0};
        int[] nums2 = {17, 21, 88, 94};
        mergeArrays(nums1, nums1.length - nums2.length, nums2, nums2.length);
        Arrays.stream(nums1).forEach(i -> System.out.print(i + "\t"));

    }

    static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
        } else if (n != 0) {
            int[] copy = Arrays.copyOfRange(nums1, 0, m);
            int l = 0, k = 0;
            for (int i = 0; i < nums1.length; i++) {
                if (k == nums2.length) {
                    k--;
                    nums2[k] = Integer.MAX_VALUE;
                }
                if (l == copy.length) {
                    l--;
                    copy[l] = Integer.MAX_VALUE;
                }
                if (copy[l] > nums2[k])
                    nums1[i] = nums2[k++];
                else
                    nums1[i] = copy[l++];
            }
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length==0){
            nums1=nums1;
        }
        if(nums1.length==0){
            nums1=nums2;
        }
        int i=m-1,j=n-1;
        for(int k=nums1.length-1; j>=0;k--){
            if(i>=0 && nums1[i]>=nums2[j]){
                nums1[k]=nums1[i];
                i--;
                continue;
            }
            nums1[k]=nums2[j];
            j--;
        }
    }

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = 0, j = 0;
//        int k = 0;
//
//        while (i < m && j < n) {
//            if (nums1[i] <= nums2[j]) {
//                nums1[k] = nums1[i];
//                i++;
//            } else {
//                int temp = nums1[k];
//                nums1[k] = nums2[j];
//                nums2[j] = temp;
//                k--;
//            }
//            k++;
//        }
//        k--;
//        Arrays.stream(nums1).forEach(a -> System.out.print(a + "\t"));
//        System.out.println();
//
//        while (i < m) {
//            if(nums1[k] < nums1[i]) {
//                nums1[k] = nums1[i];
//                i++;
//                k++;
//            }
//            else {
//                int temp = nums1[k];
//                nums1[k] = nums2[j];
//                nums2[j] = temp;
//            }
//        }
//
//        Arrays.stream(nums1).forEach(a -> System.out.print(a + "\t"));
//        System.out.println();
//
//        while (j < n) {
//            if(nums1[k] < nums2[j]) {
//                k++;
//                nums1[k] = nums2[j];
//                j++;
//            }
//            else {
//                int l = k;
//                while(nums1[l] > nums2[j]) {
//                    int temp = nums1[l];
//                    nums1[l] = nums2[j];
//                    nums2[j] = temp;
//                    l--;
//                }
//            }
//        }
//
//        Arrays.stream(nums1).forEach(a -> System.out.print(a + "\t"));
//        System.out.println( );
//    }
}
