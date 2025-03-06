package practise;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int[] array = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int lisLength = findLISLength(array);
        System.out.println("Length of Longest Increasing Subsequence: " + lisLength);
    }

    private static int findLISLength(int[] array) {
        int n = array.length;
        int[] lisLengths = new int[n];
        Arrays.fill(lisLengths, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && lisLengths[i] < lisLengths[j] + 1) {
                    lisLengths[i] = lisLengths[j] + 1;
                }
            }
        }

        // Find the maximum LIS length
        int maxLength = 0;
        for (int length : lisLengths) {
            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }
}
