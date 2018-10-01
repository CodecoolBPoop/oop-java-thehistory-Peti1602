package com.codecool.thehistory;

import java.util.*;

public class TheHistoryLinkedList implements TheHistory {
    /**
     * This implementation should use a String LinkedList so don't change that!
     */
    private List<String> wordsLinkedList = new LinkedList<>();

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        wordsLinkedList = Arrays.asList(text.split(" "));
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
        String text = toString();
        String result = text.replaceAll(wordToBeRemoved, "");
        wordsLinkedList = Arrays.asList(result.split(" "));
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
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
        Collections.replaceAll(wordsLinkedList, from, to);
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
        String text = toString();
        String result = text.replaceAll(fromWords[0], toWords[0]);
        wordsLinkedList = Arrays.asList(result.split(" "));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsLinkedList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

}
