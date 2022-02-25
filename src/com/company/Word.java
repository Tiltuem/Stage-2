package com.company;

public class Word {
    private char[] word;

    public char[] getWord() {
        return word;
    }
    public void setWord(Word[] words) {
        this.word = word;
    }

    public Word(String word) {
        this.word = word.toCharArray();
    }
    public int getSymbolCount() {
        return word.length;
    }
    public String getOriginalWord() {
        String allWord = "";
        for (int i = 0; i < word.length; i++) {
            allWord+=word[i];
        }
        return allWord;
    }
}
