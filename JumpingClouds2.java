package Problem_Solving_Algorithms;

public class JumpingClouds2 {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int position = 0;
        int numOfJumps = 0;
        int maxJump;
        int minJump;
        while ( position < c.length-1){
            if(position >= c.length-2){
                position += 1;
                numOfJumps += 1;
            } else {
                maxJump = c[position+2];
                minJump = c[position+1];
                if(minJump  == 1 || maxJump == minJump){
                    position += 2;
                } else {
                    position += 1;
                }
                numOfJumps += 1;
            }
        }
        return numOfJumps;
    }

    public static void main(String[] args) {
        int[] c = {0,0,1,0,0,1,0};
        System.out.println(jumpingOnClouds(c));
    }

}
