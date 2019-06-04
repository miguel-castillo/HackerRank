package Problem_Solving_Algorithms;

public class ViralAdvertising {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int cumulative = 0;
        int shared = 5;
        int liked = 0;

        for (int i = 1; i <= n; i++) {
            liked = shared/2;
            cumulative += liked;
            shared = liked * 3;
        }
        return cumulative;
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }

}
