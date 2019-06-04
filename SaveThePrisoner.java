package Problem_Solving_Algorithms;

public class SaveThePrisoner {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        int output = (((s - 1) + (m - 1)) % n) + 1;
        return output;
    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(3, 7, 3));
    }
}
