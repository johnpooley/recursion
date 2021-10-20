import model.Atom;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RecursionTextTest {

    private final RecursionText recursionText = new RecursionText();
    private final Atom newWord = new Atom("new");
    private final Atom boots = new Atom("boots");
    private final Atom and = new Atom("and");
    private final Atom panties = new Atom("panties");
    private final Atom number = new Atom(12L);

    @Test
    public void removeItemFromListTest() {
        String item = boots.getWord();
        List<Atom> list = List.of(newWord, newWord, boots, and, panties, number);
        List<Atom> returnedList = List.of(newWord, newWord, and, panties, number);

        assertEquals(returnedList, recursionText.removeItemFromList(item, list));
    }

    @Test
    public void removeAllInstancesOfItemFromListTest() {
        String item = newWord.getWord();
        List<Atom> list = List.of(newWord, boots, newWord, and, newWord, panties, newWord, number);
        List<Atom> returnedList = List.of(boots, and, panties, number);

        assertEquals(returnedList, recursionText.removeAllInstancesOfItemFromList(item, list));
    }
}