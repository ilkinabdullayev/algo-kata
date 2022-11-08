package info.abdullayev.contiguous;

import java.util.Arrays;

public class AverageOfSubarrayOfSizeK {


    public static double[] findAverages(int[] arr, int k) {
        double[] sumAverage = new double[arr.length - k + 1];
        double windowSum = 0;
        int windowStart = 0;
        for (int slidingEnd = 0; slidingEnd < arr.length; slidingEnd++) {
            windowSum += arr[slidingEnd];

            if (slidingEnd >= k - 1) {
                sumAverage[windowStart] = windowSum / k;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return sumAverage;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        int k = 5; //7 =>

        Arrays.stream(findAverages(array, k)).forEach(System.out::println);
    }

}
