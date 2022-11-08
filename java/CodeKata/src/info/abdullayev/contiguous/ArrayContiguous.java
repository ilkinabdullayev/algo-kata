package info.abdullayev.contiguous;

public class ArrayContiguous {

    public static void main(String[] args) {
        int[] array = new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        int k = 5; //7 =>

        double[] sumArray = new double[array.length - k + 1];
        for (int i = 0; i < sumArray.length; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += array[j] ;
            }

            sumArray[i] = (double) sum / k;
        }


        for (double sum: sumArray) {
            System.out.println(sum);
        }
    }
}
