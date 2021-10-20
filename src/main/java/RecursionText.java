import model.Atom;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class RecursionText {

    Logger logger = Logger.getLogger(RecursionText.class.getName());

    public List<Atom> removeItemFromList(String item, List<Atom> list) {
        logger.info("recursion!");
        if (list.isEmpty()) {
            return list;
        }
        Atom first = ListMethods.car(list);
        List<Atom> list2 = ListMethods.cdr(list);
        if (first.getWord().equals(item)) {
            logger.info("found it!");
            return list2;
        } else {
        logger.info("not the one");
        }
        List<Atom> newList = new ArrayList<>(removeItemFromList(item, list2));
        newList.add(0, first);
        return newList;
    }

    public List<Atom> removeAllInstancesOfItemFromList(String item, List<Atom> list) {
        if (list.isEmpty()) {
            return list;
        }
        logger.info("shrink the list!");
        List<Atom> returnedList = new ArrayList<>(removeItemFromList(item, list));
        logger.info("list is now: " + returnedList);
        return returnedList.size() == list.size() ? returnedList : removeAllInstancesOfItemFromList(item, returnedList);
    }
}
