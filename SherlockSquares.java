package Problem_Solving_Algorithms;

public class SherlockSquares {
    // Complete the squares function below.
    static int squares(int a, int b) {
        int x = (int) Math.ceil(Math.sqrt(a));
        int y = (int) Math.floor(Math.sqrt(b));
        return y-x + 1;
    }

    public static void main(String[] args) {
        System.out.println(squares(3,3));;
    }
}
