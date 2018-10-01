package com.codecool.thehistory;

public class TheHistoryArray implements TheHistory {

    /**
     * This implementation should use a String array so don't change that!
     */
    private String[] wordsArray = new String[0];

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        wordsArray = text.split(" ");
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
        String text = toString();
        String newText = text.replaceAll(wordToBeRemoved, "");
        wordsArray = newText.split(" ");
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
        String[] fromWordArray = fromWord.split(" ");
        if (fromWordArray.length == 1){
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
        String text = toString();
        String newText = text.replaceAll(from, to);
        wordsArray = newText.split(" ");
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
        String text = toString();
        String newText = text.replaceAll(fromWords[0], toWords[0]);
        wordsArray = newText.split(" ");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
