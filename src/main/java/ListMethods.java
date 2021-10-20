import model.Atom;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

    public static List<Atom> cdr(List<Atom> list) {
        return list.subList(1, list.size());
    }

    public static Atom car(List<Atom> list) {
        return list.get(0);
    }

    public static List<Atom> cons(Atom item, List<Atom> list) {
        List<Atom> newList = new ArrayList<>(list);
        newList.add(0, item);
        return newList;
    }

}
