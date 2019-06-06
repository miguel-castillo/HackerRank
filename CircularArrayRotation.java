package Problem_Solving_Algorithms;

public class CircularArrayRotation {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] output = new int[queries.length];
        int[] finalStateArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            finalStateArray[(i+k)%a.length] = a[i];
        }
        for (int i = 0; i < output.length; i++) {
            output[i] = finalStateArray[queries[i]];
        }
        return output;
    }
    // Can be improved on space complexity
}

