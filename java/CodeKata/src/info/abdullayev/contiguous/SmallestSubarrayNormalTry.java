package info.abdullayev.contiguous;

public class SmallestSubarrayNormalTry {

    public static int findMinSubArray(int S, int[] arr) {

        int windowSum = 0;
        int windowStart = 0;
        int min = Integer.MAX_VALUE;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            System.out.println("windowEnd:" + windowEnd);

            windowSum += arr[windowEnd];

            while (windowSum >= S) {
                min = Math.min(min, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;

                System.out.println("windowEnd:" + windowEnd + ";windowStart:" + windowStart);
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int[] arr0 = { 2, 1, 7, 2, 3, 5 };
        System.out.println("Min:" +
            findMinSubArray(7, arr0));

        int[] arr = { 2, 1, 5, 2, 3, 2 };
        System.out.println("Min:" +
            findMinSubArray(7, arr));

        int[] arr2 = { 2, 1, 5, 2, 8 };
        System.out.println("Min:" +
            findMinSubArray(7, arr2));

        int[] arr3 = { 3, 4, 1, 1, 6 };
        System.out.println("Min:" +
            findMinSubArray(8, arr3));
    }
}
