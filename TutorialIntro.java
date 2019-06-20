package Problem_Solving_Algorithms;

import java.util.Arrays;

public class TutorialIntro {

    // Complete the introTutorial function below.
    static int introTutorial(int V, int[] arr) {
        return Arrays.binarySearch(arr,V);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,7,9,12};
        int V = 4;
        System.out.println(introTutorial(V, arr));
    }

}
