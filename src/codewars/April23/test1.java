package codewars.April23;

public class test1 {
    public static void main(String[] args) {
        System.out.println(humanYearsCatYearsDogYears(1));
    }
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears <= 1) {
            return new int[]{humanYears,humanYears * 15, humanYears * 15};
        } else if (humanYears == 2) {
            return  new int[]{2,24,24};
        } else {
            return new int[]{humanYears, (humanYears-2) * 4 + 24, (humanYears-2) * 5 + 24};
        }
    }

}
