package Problem_Solving_Algorithms;

public class CatMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        String output;

        int distanceOfCatA = Math.abs(x-z);
        int distanceOfCatB = Math.abs(y-z);

        if(distanceOfCatA < distanceOfCatB){
            output = "Cat A";
        }
        else if(distanceOfCatB < distanceOfCatA) {
            output = "Cat B";
        } else {
            output = "Mouse C";
        }

        return output;
    }

    public static void main(String[] args) {

    }

}
