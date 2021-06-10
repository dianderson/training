package com.mendonca.anagrama.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreateAnagramService {

    private void add(String word, List wordList) {
        if (!wordList.contains(word)) {
            wordList.add(word);
        }
    }

    public List<String> createAnagram(String word) {
        List<String> wordList = new ArrayList<>();
        List<String> newWordList = new ArrayList<>();
        String prefix = String.valueOf(word.charAt(0));
        String suffix = word.substring(1);

        if (suffix.length() > 1) {
            wordList = createAnagram(suffix);
        } else {
            add(suffix, wordList);
        }

        for (String w : wordList) {
            for (int i = 0; i <= w.length(); i++) {
                newWordList.add(w.substring(0, i) + prefix + w.substring(i));
            }
        }

        return newWordList;
    }
}
