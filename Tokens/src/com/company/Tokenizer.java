package com.company;

import java.util.List;

/**
 * Created by Ayrat on 03.10.2016.
 */
public interface Tokenizer {

    List<Token> parse(String text);
}
