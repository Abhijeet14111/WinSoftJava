import java.util.*;

public class Array_Sum {

    public static void main(String[] args) {
        int[] arr1 = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] arr2 = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        int maxSum = findMaxSumPath(arr1, arr2);
        System.out.println(maxSum);
    }

    private static int findMaxSumPath(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0;
        int maxSum = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                maxSum += Math.max(sum1, sum2);
                maxSum += arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        while (i < m) {
            sum1 += arr1[i++];
        }

        while (j < n) {
            sum2 += arr2[j++];
        }

        maxSum += Math.max(sum1, sum2);

        return maxSum;
    }
}