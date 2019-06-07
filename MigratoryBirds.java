package Problem_Solving_Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int[] map = new int[5];
        for (int i = 0; i < arr.size(); i++) {
            int key = arr.get(i)-1;
            map[key] = map[key] + 1;
        }
        int output = max(map);
        return output;
    }
    static int max(int[] map){
        int maxType = 0;
        int numberOfMaxType = map[maxType];
        for (int i = 1; i < map.length; i++) {
            if(map[i] == numberOfMaxType){
                maxType = java.lang.Math.min(maxType,i);
            }
            else if(map[i] > numberOfMaxType){
                maxType = i;
                numberOfMaxType = map[maxType];
            }
        }
        return maxType+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1,3,4};
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            x.add(arr[i]);
        }
        migratoryBirds(x);
    }
}
