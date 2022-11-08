package info.abdullayev.contiguous;

public class MaxSubArrayNormalTry {

    public static void main(String[] args) {
        int [] array = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("Max:" + findMax(array, k));


        int [] array2 = {2, 3, 4, 1, 5};
        k = 2;

        System.out.println("Max:" + findMax(array2, k));
    }

    public static int findMax(int [] array, int k) {
        int max = 0;
        int sum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < array.length; windowEnd++) {
            sum += array[windowEnd];

            if (windowEnd >= k - 1) {
                max = Math.max(max, sum);
                sum -= array[windowStart];
                windowStart++;
            }

        }

        return max;
    }
}
