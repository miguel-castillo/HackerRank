package Problem_Solving_Algorithms;

public class FindDigits {
    // Complete the findDigits function below.
    static int findDigits(int n) {
        int[] digits = getDigits(n);
        int divisibleCounter = 0;
        for (int i = 0; i < digits.length; i++) {
            if(digits[i] == 0){
                continue;
            } else {
                if (n % digits[i] == 0){
                    divisibleCounter += 1;
                }
            }
        }
        return divisibleCounter;
    }
    static int[] getDigits(int n){
        String integer = Integer.toString(n);
        int[] output = new int[integer.length()];
        for (int i = 0; i < output.length; i++) {
            output[i] = integer.charAt(i) - 48;
        }
        return output;
    }
}
