package codewars.May7;

import java.util.ArrayList;
import java.util.List;
//done
public class Test1 {
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(1,9));
    }

    public static int dontGiveMeFive(int start, int end) {
        List<Integer> answer = new ArrayList<>();
        for (int i = start; i <= end ; i++) {
            boolean hasFive = false;
            char[] numbers = (i + "").toCharArray();
            for (char number : numbers) {
                if (number == '5'){
                    hasFive = true;
                    break;
                }
            }
            if (!hasFive){
                answer.add(i);
            }
        }

        return answer.size();
    }
}
