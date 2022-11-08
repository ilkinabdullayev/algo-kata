package info.abdullayev.contiguous;

public class MaxSubArrayFirstTry {

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
        for (int i = 0; i < array.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += array[j];
            }

            if (max < sum) {
                max = sum;
            }

        }

        return max;
    }
}
