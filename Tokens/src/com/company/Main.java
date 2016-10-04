package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        String target = scanner.nextLine();

        setMsg(target);

        SimpleTokenizerImpl tokenizer = new SimpleTokenizerImpl();
        List<Token> tokens = tokenizer.parse(target);

        for (Token token : tokens){
            setMsg(String.format("%s     start %d end %d type %s",token.content(), token.start(), token.end(), token.type().name()));
        }
    }

    public static void setMsg(String msg){
        System.out.println(msg);
    }
}
