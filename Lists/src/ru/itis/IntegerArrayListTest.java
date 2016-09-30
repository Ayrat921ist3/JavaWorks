package ru.itis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by KFU-user on 30.09.2016.
 */
public class IntegerArrayListTest {

    private static final int GET_CORRECT_POSITION = 2;
    private static final int GET_CORRECT_ANSWER_ON_CORRECT_POSITION = 3;
    private static final int GET_INCORRECT_POSITION = 10;
    private static final int[] TEST_ARRAY = {2, 5, 3, 4, 8};
    IntegerArrayList testedList;

    @Before
    public void setUp() throws Exception{
        testedList = new IntegerArrayList(TEST_ARRAY);
    }
    @Test
    public void testGetOnCorrectData() throws Exception {
        int expected = GET_CORRECT_ANSWER_ON_CORRECT_POSITION;

        int actual = testedList.get(GET_CORRECT_POSITION);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetOnIncorrectData() throws Exception{
        testedList.get(GET_INCORRECT_POSITION);
    }

    @Test
    public void add() throws Exception {
        int[] expected = {2, 5, 3, 4, 8, 5};
        testedList.add(5);
        int[] actual = testedList.getData();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void add1() throws Exception {

        int[] expected = {2, 5, 3, 7, 4, 8};

        testedList.add(7, 3);
        int[] actual = testedList.getData();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void delete() throws Exception {
        int[] expected = {2, 5, 4, 8};

        testedList.delete(3);

        int[] actual = testedList.getData();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void deleteByPosition() throws Exception {

        int[] expected = {2, 5, 3, 8};

        testedList.deleteByPosition(3);

        int[] actual = testedList.getData();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void find() throws Exception {
        int expected = 4;
        int actual = testedList.find(8);

        assertEquals(expected, actual);
    }

    @Test
    public void get() throws Exception {

        int expected = 3;
        int actual = testedList.get(2);

        assertEquals(expected, actual);
    }
}