package Problem_Solving_Algorithms;

public class InsertionSort1 {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int numToPlaceCorrectly = arr[n-1];
        for (int i = n-2; i >= -1; i--) {
            if(i == -1){
                arr[i+1] = numToPlaceCorrectly;
            }
            else if(numToPlaceCorrectly < arr[i]){
                arr[i+1] = arr[i];
            }
            else if(numToPlaceCorrectly >= arr[i]){
                arr[i+1] = numToPlaceCorrectly;
                printArray(arr);
                break;
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
        int[] arr = {2,4,6,8,3};
        int[] arr1 = {2,3,4,5,6,7,8,9,10,1};
        insertionSort1(10,arr1);
    }

}
