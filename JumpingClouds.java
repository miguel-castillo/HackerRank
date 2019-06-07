package Problem_Solving_Algorithms;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int numberOfJumps = 0;
        int timesHittingThundercloud = 0;
        int position = 0;
        if (c.length % k != 0){
            return 94;
        }
        do {
            position = (position + k) % c.length;
            if(c[position] == 1){
                timesHittingThundercloud += 1;
            }
            numberOfJumps += 1;
        } while (position != 0);
        int energy = 100 - (numberOfJumps + (2 * timesHittingThundercloud));
        return energy;
    }

    public static void main(String[] args) {
        int[] x = {1,1,1,0,1,1,0,0,0,0};
        jumpingOnClouds(x,3);
    }

}
