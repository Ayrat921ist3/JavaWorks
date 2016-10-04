package com.company;

/**
 * Created by Ayrat on 03.10.2016.
 */
public class Word implements Token {

    private int start;
    private int end;
    private Tokens type;
    private String content;

    public Word(int start, int end, Tokens type, String content) {
        this.start = start;
        this.end = end;
        this.type = type;
        this.content = content;
    }

    @Override
    public int start() {
        return start;
    }

    @Override
    public int end() {
        return end;
    }

    @Override
    public Tokens type() {
        return type;
    }

    @Override
    public String content() {
        return content;
    }
}
