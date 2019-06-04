package Problem_Solving_Algorithms;

public class BeautifulDays {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int[] days = new int[(j-i) + 1];
        addDays(i,j, days);
        return findBeautifulDays(days, k);
    }

    static int findBeautifulDays(int[] arr, int k){
        int beautifulDays = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int reverseVal = getReverse(val);
            boolean check = Math.abs(val-reverseVal) % k == 0;
            if(check){
                beautifulDays += 1;
            }
        }
        return beautifulDays;
    }

    static int getReverse(int num){
        String string = Integer.toString(num);
        int reverse = Integer.parseInt(new StringBuilder(string).reverse().toString());
        return reverse;
    }

    static void addDays(int f, int l, int[] arr){
        for (int i = f; i<=l; i++){
            arr[i-f] = i;
        }
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }

}
