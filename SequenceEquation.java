package Problem_Solving_Algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class SequenceEquation {
    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int[] indexOfValueX = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            int indexOfX = p[i] - 1;
            indexOfValueX[indexOfX] = i+1;
        }
        int[] output = new int[p.length];
        for (int i = 1; i <= output.length; i++) {
            int x = i;
            int indexOfX = indexOfValueX[x-1];
            int indexOfIndexOfX = indexOfValueX[indexOfX-1];
            output[i-1] = indexOfIndexOfX;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] p = {5,2,1,3,4};
        int[] x = permutationEquation(p);
    }
}
