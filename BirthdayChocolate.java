package Problem_Solving_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        List<Integer> temp = new ArrayList<>();
        int sum;
        int counter = 0;

        for(int i = 0; i < s.size(); i++){
            temp.add(s.get(i));
            if(temp.size() == m){
                sum = sum(temp);
                if(sum == d) {
                    counter += 1;
                    temp.clear();
                    temp.add(s.get(i));
                }
            }
            else if(temp.size() > m){
                temp.clear();
                temp.add(s.get(i));
            }
        }

        return counter;

    }

    static int sum(List<Integer> arr){
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
        }
        return sum;
    }

    public static void main(String[] args){
        int[] sItems = {1,2,3,4,5,4,3,2,1};
        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < sItems.length; i++) {
            int sItem = sItems[i];
            s.add(sItem);
        }

        int d = 15;

        int m = 6;

        int result = birthday(s, d, m);
        System.out.println(result);
    }

}
