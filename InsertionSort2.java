package Problem_Solving_Algorithms;

public class InsertionSort2 {

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {

        int numToPlaceCorrectly;
        int position;
        for (int i = 1; i < n; i++) {
            position = i;
            numToPlaceCorrectly = arr[position];
            for (int j = i-1; j >= 0 ; j--) {
                if(numToPlaceCorrectly < arr[j]){
                    int temp = numToPlaceCorrectly;
                    arr[position] = arr[j];
                    arr[j] = temp;
                    position = j;
                }
            }
            printArray(arr);
        }

    }

    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,5,6,2};
        int[] arr1 = {8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort2(8, arr1);
    }
}
