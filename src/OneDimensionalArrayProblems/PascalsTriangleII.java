package OneDimensionalArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    static int rowIndex = 3;
    public static void main(String[] args) {
        getRow(rowIndex).forEach(j -> System.out.print(j + "\t"));
    }

    static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> resultList = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i)
                    list.add(1);
                else {
                    list.add(resultList.get(i-1).get(j-1) + resultList.get(i-1).get(j));
                }
            }
            resultList.add(list);
        }
        return resultList.get(rowIndex);
    }

}
