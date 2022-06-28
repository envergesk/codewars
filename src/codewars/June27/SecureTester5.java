package codewars.June27;

import java.util.Arrays;
//done
public class SecureTester5 {
    public static boolean alphanumeric(String s){
        char[] chars = s.toCharArray();
        if (chars.length == 0){
            return false;
        }
        for (char aChar : chars) {
            if ((int)aChar >= 48 && (int)aChar <= 57){
                continue;
            } else if ((int)aChar >= 65 && (int)aChar <= 90){
                continue;
            } else if ((int)aChar >= 97 && (int)aChar <= 122){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
