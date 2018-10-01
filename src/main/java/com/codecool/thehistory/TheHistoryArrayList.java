package com.codecool.thehistory;

import java.util.*;

public class TheHistoryArrayList implements TheHistory {
    /**
     * This implementation should use a String ArrayList so don't change that!
     */
    private List<String> wordsArrayList = new ArrayList<>();

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        wordsArrayList = Arrays.asList(text.split(" "));
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
        String text = toString();
        String result = text.replaceAll(wordToBeRemoved, "");
        wordsArrayList = Arrays.asList(result.split(" "));
    }

    @Override
    public int size() {
        //TODO: check the TheHistory interface for more information
        return 0;
    }

    @Override
    public void clear() {
        //TODO: check the TheHistory interface for more information
    }

    public void replace(String fromWord, String toWord){
        List<String> newFromWordList = new ArrayList<String>(Arrays.asList(fromWord.split(" ")));
        if (newFromWordList.size() == 1){
            replaceOneWord(fromWord, toWord);
        } else {
            String[] newFromWordArray = new String[1];
            String[] newToWordArray = new String[1];
            newFromWordArray[0] = fromWord;
            newToWordArray[0] = toWord;
            replaceMoreWords(newFromWordArray, newToWordArray);
        }
    }

    @Override
    public void replaceOneWord(String fromWord, String toWord) {
        //TODO: check the TheHistory interface for more information
        Collections.replaceAll(wordsArrayList, fromWord, toWord);
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
        String text = toString();
        String result = text.replaceAll(fromWords[0], toWords[0]);
        wordsArrayList = Arrays.asList(result.split(" "));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArrayList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

}
