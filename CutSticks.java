package Problem_Solving_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CutSticks {
    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        List<Integer> temp = new ArrayList<>();
        deleteSticks(arr,arr.length,0,temp);
        int[] x = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            x[i] = temp.get(i);
        }
        return x;
    }

    static void deleteSticks(int[] arr, int arrayLength, int begin, List<Integer> cache){
        if(arrayLength == 0){
            return;
        } else {
            int smallestStick = arr[begin];
            int elementsDeleted = 0;
            int beginIndex = begin;
            cache.add((arr.length-begin)-elementsDeleted);
            for (int i = begin; i < arr.length; i++) {
                if(arr[i]-smallestStick == 0){
                    arr[i] = arr[i]-smallestStick;
                    elementsDeleted += 1;
                    beginIndex =  i + 1;
                } else {
                    arr[i] = arr[i] - smallestStick;
                }
            }
            deleteSticks(arr,arrayLength-elementsDeleted,beginIndex,cache);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,4,2,2,8};
        int[] arr1 = {1,2,3,4,3,3,2,1};
        cutTheSticks(arr1);
    }
}
