package codewars.march23;
//The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
//
//Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
//// should be 6: {4, -1, 2, 1}
//Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.
//
//Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
//undone
public class SumSubarray {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int sum(int[] array) {
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            maxSum += array[i];
        }
        int counter = 1;
        while (counter != array.length) {
            int currentSum1 = 0;
            int currentSum2 = 0;
            for (int i = 0; i < array.length - counter; i++) {
                currentSum1 += array[i];
            }
            for (int i = 0 + counter; i < array.length; i++) {
                currentSum2 += array[i];
            }
            if (currentSum1 > maxSum || currentSum2 > maxSum) {
                if (currentSum1 > currentSum2) {
                    maxSum = currentSum1;
                } else {
                    maxSum = currentSum2;
                }
            }
            counter++;
        }
        System.out.println(maxSum);
        return maxSum;
    }
}
