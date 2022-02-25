package com.company;

public class Sentence {
    private Word[] words;

    public Word[] getWords() {
        return words;
    }
    public void setWords(Word[] words) {
        this.words = words;
    }

    public Sentence (String[] words) {
        this.words = new Word[words.length];
        for(int i=0; i<words.length; i++) {
            this.words[i]=new Word(words[i]);
        }
    }
    public int getWordsCount () {
        int count=0;
        for(int i=0; i<words.length; i++) {
            count++;
        }
        return count;
    }
    public Word getWordByPosition (int pos) {
        return words[pos-1];
    }
    public String getOriginalSentence () {
        String allWords = "";
        for (int i = 0; i < words.length; i++) {
            allWords+=words[i];
        }
        return allWords;
    }
}
