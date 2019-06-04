package Problem_Solving_Algorithms;

public class AngryProfessor {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int attendance = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] <= 0){
                attendance += 1;
            }
        }
        if(attendance >= k){
            return "NO";
        } else {
            return "YES";
        }
    }

}
