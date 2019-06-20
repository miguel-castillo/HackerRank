package Problem_Solving_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class QuickSort1 {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {

        int pivot = arr[0];
        List<Integer> right = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < pivot){
                left.add(arr[i]);
            }
            else if(arr[i] > pivot){
                right.add(arr[i]);
            } else {
                equal.add(pivot);
            }
        }
        int[] output = new int[arr.length];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if(!left.isEmpty()){
                output[i] = left.get(position);
                left.remove(position);
            }
            else if(!equal.isEmpty()) {
                output[i] = equal.get(position);
                equal.remove(position);

            } else {
                output[i] = right.get(position);
                right.remove(position);

            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,3,7,2};
        quickSort(arr);
    }

}
