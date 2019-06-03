package Problem_Solving_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class MagicSquare {
    static int arr[][][]={
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}};

    static int formingMagicSquare(int[][] s) {
        int min = 99999;
        int sum=0;
        for(int i=0;i<8;i++) {
            for(int j=0;j<3;j++) {
                for(int k=0;k<3;k++) {
                    sum=sum+Math.abs(arr[i][j][k]-s[j][k]);
                }
            }
            if(sum<min) {
                min = sum;
            }
            sum=0;
        }
        return min;
    }
}
