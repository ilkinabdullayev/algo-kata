package info.abdullayev.contiguous;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {

    public static int findLength(String str) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int longest = -1;
        int startIndex = 0;
        for (int endIndex = 0; endIndex < str.length(); endIndex++) {
            Character currentChar = str.charAt(endIndex);
            characterIntegerMap.put(currentChar, characterIntegerMap.getOrDefault(currentChar, 0) + 1);

            while (characterIntegerMap.get(currentChar) > 1) {
                Character firstChar = str.charAt(startIndex);
                characterIntegerMap.put(firstChar, characterIntegerMap.get(firstChar) - 1);

                if (characterIntegerMap.get(firstChar) == 0) {
                    characterIntegerMap.remove(firstChar);
                }

                startIndex++;
            }


            longest = Math.max(longest, endIndex - startIndex + 1);
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("aabccbb"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abbbb"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abccde"));
    }

}
