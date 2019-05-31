package Problem_Solving_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairsBruteForce {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int numberOfDivisibleSumPairs = 0;
        for(int i = 0; i < ar.length; i++){
            for(int j = i+1; j < ar.length; j++){
                if((ar[i]+ar[j])% k == 0){
                    numberOfDivisibleSumPairs = numberOfDivisibleSumPairs + 1;
                }
            }
        }
        return numberOfDivisibleSumPairs;
    }


}
