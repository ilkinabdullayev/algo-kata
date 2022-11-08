package info.abdullayev.contiguous;

public class SmallestSubarrayFirstTry {

    public static int findMinSubArray(int S, int[] arr) {
        int minLength = 0;
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            int length = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                length++;

                if (sum >= S) {
                    break;
                }

                if (j == arr.length - 1) {
                    length = 0;
                }
            }

            if (length != 0) {
                minLength = minLength == 0 ? length : Math.min(minLength, length);
            }

        }

        return minLength;
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
