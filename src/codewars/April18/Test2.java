package codewars.April18;

import java.util.Arrays;
//done
public class Test2 {
    public static void main(String[] args) {
        System.out.println(zeros(14));
    }

    public static int zeros(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        String temp = Long.toString(f);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = temp.charAt(i) - '0';
        }
        int count = 0;
        for (int i = newGuess.length - 1; i >= 0 && newGuess[i] == 0 ; i--) {
            count++;
        }
        return count;
    }
}
