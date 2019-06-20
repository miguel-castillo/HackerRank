package Problem_Solving_Algorithms;

public class RunningTime {
    public static int runningTime(int[] A){
        int count = 0;
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                count += 1;
                j = j - 1;
            }
            A[j + 1] = value;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 1, 2};
        runningTime(arr);
    }
}
