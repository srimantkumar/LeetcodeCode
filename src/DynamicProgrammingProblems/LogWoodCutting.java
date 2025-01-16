package DynamicProgrammingProblems;

import java.util.ArrayList;


public class LogWoodCutting {

    public static void main(String []args)
    {
        ArrayList<Integer> LogSegmentLength = new ArrayList<>();
		/*
		 * e.g. 1
		LogSegmentLength.add(4);
		LogSegmentLength.add(1);
		LogSegmentLength.add(2);
		LogSegmentLength.add(3);
		*/

        //e.g. 2
        LogSegmentLength.add(1);
        LogSegmentLength.add(1);
        LogSegmentLength.add(1);
        LogSegmentLength.add(1);

        System.out.println(LogWoodCutting.minimumPrice(LogSegmentLength));
    }

    private static int minimumPrice(ArrayList<Integer> logSegmentLength) {
        int n = logSegmentLength.size();
        int[][] length = new int[n+1][n+1];
        int[][] minCost = new int[n+1][n+1];
        int[][] preCut = new int[n+1][n+1];
        int i,k;

        for(i=0;i<n;i++)
            length[i][i+1]=logSegmentLength.get(i);

        for (k = 2; k <= n; k++)
            for (i = 0; i < n; i++) {
                if (i + k <= n)
                    length[i][i + k] = length[i][i + k - 1] + length[i + k - 1][i + k];
            }


        for(i=0;i<n-1;i++)
            minCost[i][i+2]=length[i][i+2];


        for(i=0;i<n-1;i++)
            preCut[i][i+2]=i+1;


        for (k = 3; k <= n; k++)
            for (i = 0; i < n; i++) {
                if (i + k <= n)
                    minCost[i][i + k] = findMin(i, i+k, minCost, length, preCut);

            }

        System.out.print("Cutting sequence:");
        printCut(0,n, preCut);
        System.out.println();

        return minCost[0][n];
    }

    private static void printCut(int i, int j, int[][] preCut) {
        if(preCut[i][j]==0) return;
        System.out.print(preCut[i][j] + " ");
        int cut = preCut[i][j];
        printCut(i,cut,preCut);
        printCut(cut,j,preCut);

    }

    private static int findMin(int i, int j, int[][] minCost, int[][] length, int[][] preCut) {
        int value = minCost[i][i+1]+minCost[i+1][j];
        preCut[i][j]=i+1;
        int k=2;
        while(i+k<j)
        {
            if((minCost[i][i+k]+minCost[i+k][j])<=value)
            {
                value = (minCost[i][i+k]+minCost[i+k][j]);
                preCut[i][j]=i+k;
            }
            k++;
        }
        return value + length[i][j];
    }


}
