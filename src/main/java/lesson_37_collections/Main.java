package lesson_37_collections;
//
//Створити Клас WordUtils у якого є метод:
//Порахувати скільки разів кожне слово повторюється у реченні

import java.util.*;

public class Main {
    static void main() {

//        WordUtils wordUtils = new WordUtils();
//        Щоб викликати якийсь метод з іншого класу, треба зробити його статичним або створити як новий обʼєкт.


        /*
        Key(String)="I", Value(Integer)-2
        Key(String)="like", Value(Integer)-4
        Key(String)="eat", Value(Integer)-2
        Key(String)="pizza", Value(Integer)-1
        Key(String)="cakes", Value(Integer)-1
        Key(String)="and", Value(Integer)-1
         */

        List<String> words = new ArrayList<>();

        words.add("java");
        words.add("is");
        words.add("spring");
        words.add("boot");
        words.add("java");

        String sentence = "I like eat pizza and I like eat cakes";
        String sentence2 = "I like eat pizza and I like eat cakes like like";

        String shortestWord = WordUtils.getShortestWord(words);
        Set<String> uniqueWords = WordUtils.getUniqueWords(sentence);
        Set<String> duplicatedWords = WordUtils.getDuplicatedWords(sentence);
        Map<String, Integer> wordCounts = WordUtils.countWords(sentence2);


        System.out.println("Shortest word: " + shortestWord);
        System.out.println("Unique words in our sentence: " + uniqueWords);
        System.out.println("Duplicated words in our sentence: " + duplicatedWords);
        System.out.println("Words in our sentence: " + wordCounts);
    }

}
