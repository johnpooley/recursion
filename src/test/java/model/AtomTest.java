package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtomTest {

    @Test
    public void canSetAndGetWordType() {
        Atom word1 = new Atom("word1");
        Atom word2 = new Atom("word2");
        word2.setWord("word3");
        word1.setNumber(23L);
        assertEquals(AtomType.Word, word1.getType());
        assertEquals(0L, word1.getNumber());
        assertEquals("word3", word2.getWord());
    }

    @Test
    public void canSetAndGetNumberType() {
        Atom number1 = new Atom(15L);
        Atom number2 = new Atom(6L);
        number2.setWord("word3");
        number1.setNumber(23L);
        number2.setNumber(20);
        assertEquals(AtomType.Number, number1.getType());
        assertEquals(23L, number1.getNumber());
        assertEquals("20", number2.getWord());
    }


}