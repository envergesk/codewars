package codewars.April3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JosephusSurvivor {
    private static final List<Integer> list = new ArrayList<>();


    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            list.add(i);
        }
        System.out.println(josephusPermutation(list, 2));

    }

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<Integer> answer = new ArrayList<>();
        answer.add(k);
        for (int i = 1; i < list.size(); i++) {
            if (i + k >= list.size()) {
                answer.add((i + k) % list.size());
            } else {
                answer.add(list.get(i + k));
            }

        }
        return (List<T>) answer;
    }
}

