public class UtopianTree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        int heightOfTree = 1;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                heightOfTree *= 2;
            }
            else{
                heightOfTree += 1;
            }
        }
        return heightOfTree;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(0));
    }

}
