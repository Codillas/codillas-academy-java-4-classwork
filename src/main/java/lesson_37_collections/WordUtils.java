package lesson_37_collections;

import java.util.*;

public class WordUtils {

    public static String getShortestWord(List<String> words) {

        int shortestWordLength = Integer.MAX_VALUE;
        String shortestWord = "";

//        Це якби я писав цикл який нижче через "for i".
//        for (int i = 0; i <words.size() ; i++) {
//            String word = words.get(i);     "Зберігаю наш ітератор в стрінгу"
//        }

        for (String word : words) {
            int wordLength = word.length();

            if (wordLength < shortestWordLength) {
                shortestWordLength = wordLength;
                shortestWord = word;
            }
        }

        return shortestWord;
    }

    public static Set<String> getUniqueWords(String sentence) {

        String[] words = sentence.split(" ");

        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        return uniqueWords;
    }

    public static Set<String> getDuplicatedWords(String sentence) {

        String[] words = sentence.split(" ");

        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        for (String word : words) {
          if (uniqueWords.contains(word)) {
              duplicateWords.add(word);
          } else {
              uniqueWords.add(word);
          }
        }

        return duplicateWords;
    }

    public static Map<String, Integer> countWords(String sentence2) {

        String[] words = sentence2.split(" ");

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            int currentWord = wordCounts.getOrDefault(word, 0);
            int quantityOfDuplicateWords = currentWord + 1;
            wordCounts.put(word, quantityOfDuplicateWords);

        }
        return wordCounts;
    }
}
