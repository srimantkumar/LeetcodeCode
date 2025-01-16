package OneDimensionalArrayProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(nums).forEach(System.out::print);
    }

    static Set<Integer> findDisappearedNumbers1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= nums.length; i++)
            set.add(i);

        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i]))
                set.remove(nums[i]);
        }
        return set;
    }

    static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++)
            list.add(i);

        for (int i = 0; i < nums.length; i++) {
            list.remove((Integer) nums[i]);
            //System.out.println(list.remove(nums[i]));
        }
        return list;
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {

        }
        return list;
    }
}
