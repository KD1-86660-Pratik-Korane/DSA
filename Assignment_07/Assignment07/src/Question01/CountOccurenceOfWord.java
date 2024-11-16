package Question01;
 

import java.util.*;

public class CountOccurenceOfWord{

    public static void countWordOccurrences(String text) {
        String[] words = text.toLowerCase().split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String text = scanner.nextLine();
        countWordOccurrences(text);
    }
}
