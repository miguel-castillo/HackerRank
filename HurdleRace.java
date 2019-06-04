public class HurdleRace {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        int max;
        max = max(height);
        if(max-k < 0){
            return 0;
        }
        return max - k;

    }

    static int max(int[] height){
        int max = height[0];
        int temp;
        for (int i = 0; i < height.length; i++) {
            temp = height[i];
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {

    }

}
