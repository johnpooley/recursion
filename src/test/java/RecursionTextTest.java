import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RecursionTextTest {

    private final RecursionText recursionText = new RecursionText();

    @Test
    public void removeItemFromListTest() {
        String item = "boots";
        List<String> list = List.of("new", "new", "boots", "and", "panties");
        List<String> returnedList = List.of("new", "new", "and", "panties");

        assertEquals(returnedList, recursionText.removeItemFromList(item, list));
    }

    @Test
    public void removeAllInstancesOfItemFromListTest() {
        String item = "new";
        List<String> list = List.of("new", "boots", "new", "and", "new", "panties", "new");
        List<String> returnedList = List.of("boots", "and", "panties");

        assertEquals(returnedList, recursionText.removeAllInstancesOfItemFromList(item, list));
    }
}