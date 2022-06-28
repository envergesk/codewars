package codewars.March31;
//done

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCase"));
    }

    public static String camelCase(String input) {

        char[] array = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            int ascii = (int)array[i];
            if (ascii >= 65 && ascii <= 90) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(array[i]);
        }
        return stringBuilder.toString();
    }
}
