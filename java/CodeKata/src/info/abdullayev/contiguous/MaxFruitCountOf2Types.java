package info.abdullayev.contiguous;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxFruitCountOf2Types {

    public static int findLength(char[] arr) {
        Map<Character, Integer> fruitTreeMap = new HashMap<>();
        int startIndex = 0;
        int maxLength = 0;
       for (int endIndex = 0; endIndex < arr.length; endIndex++) {
           Character currentFruit = arr[endIndex];

           fruitTreeMap.put(currentFruit, fruitTreeMap.getOrDefault(currentFruit, 0) + 1);

           while (fruitTreeMap.size() > 2) {
               Character firstFruit = arr[startIndex];
               fruitTreeMap.put(firstFruit, fruitTreeMap.get(firstFruit) - 1);

               if (fruitTreeMap.get(firstFruit) == 0) {
                   fruitTreeMap.remove(firstFruit);
               }

               startIndex++;
           }

           maxLength = Math.max(maxLength, endIndex - startIndex + 1);
       }

       return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Maximum number of fruits: " +
            MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'A', 'C' }));
        System.out.println("Maximum number of fruits: " +
            MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'B', 'C', 'A', 'A', 'A', 'A', 'B', 'D'}));
    }
}
