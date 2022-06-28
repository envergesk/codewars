package codewars.April19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static List<Long> delArray;

    public static void main(String[] args) {
        long[][] lst = new long[][]{{1, 2}, {1, 3}, {10, 40}};
        List<Long> denominators = new ArrayList<>();
        for (long[] longs : lst) {
            simplify(longs);
            denominators.add(longs[1]);
        }
        long denominator = 1;
        for (int i = 0; i < denominators.size(); i++) {
            for (int j = 0; j < denominators.size(); j++) {
                if (i == j){
                    continue;
                } else {
                    if (denominators.get(i) % denominators.get(j) == 0) {
                        denominators.remove(denominators.get(j));
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < denominators.size(); i++) {
            for (int j = 0; j < denominators.size(); j++) {
                if (i == j) {
                    continue;
                } else {
                    if (denominators.get(i) % denominators.get(j) == 0) {
                        denominators.remove(denominators.get(j));
                        break;
                    }
                }
            }
        }
        for (Long aLong : denominators) {
            denominator *= aLong;
        }
        for (long[] longs : lst) {
            long factor = denominator/ longs[1];
            longs[0] *= factor;
            longs[1] *= factor;
        }
        System.out.println(Arrays.deepToString(lst));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lst.length ; i++) {
            stringBuilder.append("(");
            for (int j = 0; j < lst[i].length; j++) {
                stringBuilder.append(lst[i][j] + "");
                if (j != lst[i].length - 1){
                    stringBuilder.append(", ");
                }

            }
            stringBuilder.append(")");
        }
        System.out.println(stringBuilder.toString());
    }

    public static long[] simplify(long[] a) {
        long limit = Math.min(a[0], a[1]);
        for (long i = 2; i <= limit; i++) {
            if (a[0] % i == 0 && a[1] % i == 0) {
                a[0] /= i;
                a[1] /= i;
            }
        }
        return a;
    }
}
