package org.howard.edu.lsp.midterm.question4;

import java.util.*;

public class WordProcessor {
    private String sentence;

    public WordProcessor(String sentence) {
        this.sentence = sentence;
    }

    public List<String> findLongestWords() {
        if (sentence.trim().isEmpty()) return new ArrayList<>();
        
        String[] words = sentence.split("\\s+");
        int maxLength = 0;
        List<String> longestWords = new ArrayList<>();
        
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWords.clear();
            }
            if (word.length() == maxLength) longestWords.add(word);
        }
        return longestWords;
    }
}

class WordProcessorDriver {
    public static void main(String[] args) {
        System.out.println(new WordProcessor("This is a test with amazing results, amazing achievements!").findLongestWords());
        System.out.println(new WordProcessor("Java is a powerful  tool!").findLongestWords());
        System.out.println(new WordProcessor("A B C D E").findLongestWords());
        System.out.println(new WordProcessor("").findLongestWords());
    }
}