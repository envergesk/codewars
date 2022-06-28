package codewars.March31;
//Write a function
//
//TripleDouble(long num1, long num2)
//which takes numbers num1 and num2 and returns 1 if there is a straight triple of a
// number at any place in num1 and also a straight double of the same number in num2.
//
//If this isn't the case, return 0

//done
public class TripleDouble {

    public static void main(String[] args) {
        long a = 451999277L;
        long b = 41177722899L;

        String a1 = a + "";
        String b1 = b + "";

        char[] charsA = a1.toCharArray();
        char[] charsB = b1.toCharArray();
        char currentA = 'X';
        char currentB = 'X';
        int counterA = 0;
        int counterB = 0;

        for (int i = 0; i < charsA.length; i++) {
            if(currentA == charsA[i]) {
                counterA++;
                if (counterA == 2){
                    break;
                }
            }
            else if (currentA != charsA[i]) {
                counterA = 0;
            }
            currentA = charsA[i];
        }
        for (int i = 0; i < charsB.length; i++) {
            if(currentB == charsB[i]) {
                counterB++;
                if (counterB == 1){
                    break;
                }
            }
            else if (currentB != charsB[i]) {
                counterB = 0;
            }
            currentB = charsB[i];
        }
    }

}
