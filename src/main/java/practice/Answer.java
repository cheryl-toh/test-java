package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Java practice for a junior QA role.
 *
 * Q1 and Q2 are concept questions: write your answer in the comment.
 * Q3 is a coding question: fill in the method, then run:  mvn test -Dtest=CountVowelsTest
 * Q4 is the Selenium test: see src/test/java/practice/LoginTest.java
 */
public class Answer{
    // ------------------------------------------------------------
    // Q1. Count vowels
    //
    // Return the number of vowels (a, e, i, o, u) in the text.
    // Ignore case. Spaces, numbers and symbols are not vowels.
    // ------------------------------------------------------------
    public static char firstUniqueChar(String text) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : text.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '_';
    }

    // OR
    public static char firstUniqueChar2(String text) {
        List<Character> chars = new ArrayList<>();
        for (char c : text.toCharArray()) {
            chars.add(c);
        }
        for (char c : chars) {
            if (Collections.frequency(chars, c) == 1) {
                return c;
            }
        }
        return '_';
    }

    // OR
    public static char firstUniqueChar3(String text) {
        List<Character> unique = new LinkedList<>();   // ArrayList works too
        List<Character> repeated = new ArrayList<>();

        for (char c : text.toCharArray()) {
            if (repeated.contains(c)) {
                continue;                              // already known to repeat
            }
            if (unique.contains(c)) {
                unique.remove(Character.valueOf(c));   // seen twice, so move it
                repeated.add(c);
            } else {
                unique.add(c);
            }
        }
        return unique.isEmpty() ? '_' : unique.get(0);
    }
}
