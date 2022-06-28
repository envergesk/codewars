package codewars.March31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Solution.rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
public class RangeExtraction4kyu {
    public static void main(String[] args) {
        int[] array = new int[]{-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        List<String> arrayList = new ArrayList<>();
        int previousValue = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (previousValue != array[i] - 1 && counter == 0) {
                arrayList.add(array[i] + "");
                previousValue = array[i];
            } else if (previousValue != array[i] - 1 && counter == 1) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(previousValue - 1 + "");
                arrayList.add(previousValue + "");
                previousValue = array[i];
                counter = 0;
            } else if (previousValue != array[i] - 1 && counter > 1) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(previousValue - counter + "" + "-" + previousValue);
                arrayList.add(array[i] + "");
                previousValue = array[i];
                counter = 0;
            } else if (array[i] == array[array.length - 1] && counter > 0) {
                arrayList.add(previousValue - counter + "" + "-" + array[i]);
                previousValue = array[i];
                counter = 0;
            } else if (previousValue == array[i] - 1) {
                previousValue = array[i];
                counter++;
            }
        }
        System.out.println(arrayList.toString().substring(1, arrayList.toString().length() - 1).replace(" ",""));


    }

}
