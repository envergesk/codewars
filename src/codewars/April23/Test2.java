package codewars.April23;

public class Test2 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 9;
        for (int i = 0; i < n / 2; i++) {
            stringBuilder.append(" ".repeat(n / 2 - i));
            stringBuilder.append("*".repeat(i * 2 + 1));
            stringBuilder.append("\n");
        }
        stringBuilder.append("*".repeat(n));
        stringBuilder.append("\n");
        for (int i = n / 2; i > 0; i--) {
            stringBuilder.append(" ".repeat(Math.max(0, n / 2 - i + 1)));
            stringBuilder.append("*".repeat(Math.max(0, i * 2 - 1)));
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
        String answer = stringBuilder.toString();
    }
}
