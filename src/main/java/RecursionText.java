import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class RecursionText {

    Logger logger = Logger.getLogger(RecursionText.class.getName());

    public List<String> removeItemFromList(String item, List<String> list) {
        logger.info("recursion!");
        if (list.isEmpty()) {
            return list;
        }
        String first = list.get(0);
        List<String> list2 = list.subList(1, list.size());
        if (first.equals(item)) {
            logger.info("found it!");
            return list2;
        } else {
        logger.info("not the one");
        }
        List<String> newList = new ArrayList<>(removeItemFromList(item, list2));
        newList.add(0, first);
        return newList;
    }

    public List<String> removeAllInstancesOfItemFromList(String item, List<String> list) {
        if (list.isEmpty()) {
            return list;
        }
        logger.info("shrink the list!");
        List<String> returnedList = new ArrayList<>(removeItemFromList(item, list));
        logger.info("list is now: " + returnedList);
        return returnedList.size() == list.size() ? returnedList : removeAllInstancesOfItemFromList(item, returnedList);
    }
}
