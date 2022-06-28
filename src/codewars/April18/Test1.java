package codewars.April18;
//done
public class Test1 {
    public static void main(String[] args) {
        System.out.println(Solve("*'&ABCDabcde12345"));
    }
    public static int[] Solve(String word) {
        char[] chars = word.toCharArray();
        int countUppers = 0;
        int countLowers = 0;
        int countNumbers = 0;
        int countSymbols = 0;
        for (char aChar : chars) {
            if ((int)aChar < 91 && (int)aChar > 64){
                countUppers++;
            } else if ((int)aChar > 96 && (int)aChar < 123){
                countLowers++;
            } else if ((int)aChar > 47 && (int)aChar < 58){
                countNumbers++;
            } else {
                countSymbols++;
            }
        }
        int[] answer = new int[4];
        answer[0] = countUppers;
        answer[1] = countLowers;
        answer[2] = countNumbers;
        answer[3] = countSymbols;
        return answer;

    }
}
