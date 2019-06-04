public class DesignerPDFView {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        int area = tallestLetter(h,word) * word.length();
        return area;
    }

    static int tallestLetter(int[] height, String word){
        int[] heightsOfCharacters = new int[word.length()];
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            heightsOfCharacters[i] = height[c-97];
        }
        int tallest = max(heightsOfCharacters);
        return tallest;
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

}
