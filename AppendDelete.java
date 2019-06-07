package Problem_Solving_Algorithms;

public class AppendDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        /* Case 1 */
        if (s.length() + t.length() <= k) {
            return "Yes";
        }

        /* Case 2 */
        int i = 0; // represents index of 1st non-matching character
        for (   ; i < s.length() && i < t.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
        }
        int minOperations = (s.length() - i) + (t.length() - i);
        if(k >= minOperations && (k - minOperations) % 2 == 0){
            return "Yes";
        } else {
            return "No";
        }

    }

    public static void main(String[] args) {
        System.out.println(appendAndDelete("abcd", "abcdert",10));
    }
    //Need to redo problem
}
