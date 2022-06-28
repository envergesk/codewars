package codewars.June26;
//done
//assertEquals("Range: 01|01|18 Average: 01|38|05 Median: 01|32|34",
//				Stat.stat("01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17"));

import java.util.Arrays;

public class StatsForAthletic6 {
    public static void main(String[] args) {
        stat("02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|32|34, 2|17|17");
    }
    public static String stat(String strg) {
        int currentRunnerTime = 0;
        int timeStampHMS = 0;
        String[] timeString = strg.split(" ");
        int runnersCount = timeString.length;
        String currentTimeFormat = "";
        int[] convertedRunnersTime = new int[runnersCount];
        int range = 0;
        int average = 0;
        int median = 0;
        for (int j = 0; j < timeString.length; j++) {
            for (int i = 0; i < timeString[j].length(); i++) {
                if (timeString[j].charAt(i) != '|' && timeString[j].charAt(i) != ',') {
                    currentTimeFormat += timeString[j].charAt(i);
                    if (j == timeString.length - 1 && i == timeString[j].length() - 1){
                        currentRunnerTime += Integer.valueOf(currentTimeFormat);
                        convertedRunnersTime[j] = currentRunnerTime;
                        System.out.println("currentRunnerTime " + currentRunnerTime);
                        timeStampHMS = 0;
                        currentTimeFormat = "";
                        currentRunnerTime = 0;
                    }
                    System.out.println(currentTimeFormat);
                } else {
                    if(timeStampHMS == 0) {
                        currentRunnerTime += 3600 * Integer.valueOf(currentTimeFormat);
                        currentTimeFormat = "";
                        timeStampHMS++;
                        System.out.println("currentRunnerTime " + currentRunnerTime);
                    } else if (timeStampHMS == 1) {
                        currentRunnerTime += 60 * Integer.valueOf(currentTimeFormat);
                        currentTimeFormat = "";
                        timeStampHMS++;
                        System.out.println("currentRunnerTime " + currentRunnerTime);
                    } else {
                        currentRunnerTime += Integer.valueOf(currentTimeFormat);
                        convertedRunnersTime[j] = currentRunnerTime;
                        System.out.println("currentRunnerTime " + currentRunnerTime);
                        timeStampHMS = 0;
                        currentTimeFormat = "";
                        currentRunnerTime = 0;
                    }
                }
            }
        }
        Arrays.sort(convertedRunnersTime);
        for (int i : convertedRunnersTime) {
            System.out.println(i);
        }
        range = convertedRunnersTime[convertedRunnersTime.length - 1] - convertedRunnersTime[0];
        for (int i : convertedRunnersTime) {
            average += i;
        }
        average = average / convertedRunnersTime.length;
        if (convertedRunnersTime.length % 2 == 1) {
            median = convertedRunnersTime[convertedRunnersTime.length / 2];
        } else {
            median = (convertedRunnersTime[convertedRunnersTime.length / 2 - 1] +
                    convertedRunnersTime[convertedRunnersTime.length / 2]) / 2;
        }
        System.out.println("Range = " + range + " Average = " + average + " Median = " + median);

        String answer = "";
        int currentHours = range / 3600;
        range = range % 3600;
        if (currentHours / 10 == 0) {
            answer += "Range: 0" + currentHours + "|";
        } else {
            answer += "Range: " + currentHours + "|";
        }
        int currentMinutes = range / 60;
        range = range % 60;
        if (currentMinutes / 10 == 0){
            answer += "0" + currentMinutes + "|";
        } else {
            answer += currentMinutes + "|";
        }
        if (range / 10 == 0) {
            answer += "0" + range + " ";
        } else {
            answer += range + " ";
        }
        currentHours = average / 3600;
        average = average % 3600;
        if (currentHours / 10 == 0) {
            answer += "Average: 0" + currentHours + "|";
        } else {
            answer += "Average: " + currentHours + "|";
        }
        currentMinutes = average / 60;
        average = average % 60;
        if (currentMinutes / 10 == 0){
            answer += "0" + currentMinutes + "|";
        } else {
            answer += currentMinutes + "|";
        }
        if (average / 10 == 0) {
            answer += "0" + average + " ";
        } else {
            answer += average + " ";
        }
        currentHours = median / 3600;
        median = median % 3600;
        if (currentHours / 10 == 0) {
            answer += "Median: 0" + currentHours + "|";
        } else {
            answer += "Median: " + currentHours + "|";
        }
        currentMinutes = median / 60;
        median = median % 60;
        if (currentMinutes / 10 == 0){
            answer += "0" + currentMinutes + "|";
        } else {
            answer += currentMinutes + "|";
        }
        if (median / 10 == 0) {
            answer += "0" + median;
        } else {
            answer += median;
        }
        System.out.println(answer);
        return answer;
    }

}
