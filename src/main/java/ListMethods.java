import model.Atom;

import java.util.List;

public class ListMethods {

    public static List<Atom> cdr(List<Atom> list) {
        return list.subList(1, list.size());
    }

    public static Atom car(List<Atom> list) {
        return list.get(0);
    }

}
