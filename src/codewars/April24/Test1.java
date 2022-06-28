package codewars.April24;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public int solution(int number) {
        List<Integer> ints = new ArrayList<>();
        for (int i = 1; i <= number; i++){
            if (i % 3 == 0 || i % 5 == 0){
                ints.add(i);
            }
        }
        int answer = 0;
        for (int i = 0; i < ints.size(); i++) {
            answer += ints.get(i);
        }
        return answer;
    }
}
