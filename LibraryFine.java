package Problem_Solving_Algorithms;

public class LibraryFine {

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if(y2 < y1){
            return 10000;
        }
        else if(y2==y1){
            if(m2 < m1){
                return (m1-m2) * 500;
            }
            else if (m1 == m2) {
                if (d2 < d1) {
                    return (d1-d2) * 15;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(libraryFine(28,2,2017,15,4,2017));
    }

}
