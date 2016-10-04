package com.company;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by Ayrat on 04.10.2016.
 */
public class SimpleTokenizerImplTest {

    private SimpleTokenizerImpl tokenizer = new SimpleTokenizerImpl();
    private List<String> parsedText;
    private static final String TEXT_TO_PARSE = "Hello, 123 world!";

    @Before
    public void setUp() throws Exception{
        parsedText = new ArrayList<>();
        for (Token token : tokenizer.parse(TEXT_TO_PARSE)){
            parsedText.add(token.content());
        }
    }

    @Test
    public void parse() throws Exception {
        List<String> expected = Arrays.asList("Hello", ",", "123", "world", "!");
        List<String> actual = parsedText;
        assertThat(actual, is(expected));
    }

}