import model.Atom;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListMethodsTest {

    @Test
    public void carTest() {
        Atom atom1 = new Atom("first");
        Atom atom2 = new Atom(2L);
        List<Atom> list = List.of(atom1, atom2);

        assertEquals(atom1, ListMethods.car(list));
    }

    @Test
    public void cdrTest() {
        Atom atom1 = new Atom("first");
        Atom atom2 = new Atom(2L);
        Atom atom3 = new Atom("last");
        List<Atom> list = List.of(atom1, atom2, atom3);
        List<Atom> cdrList = List.of(atom2, atom3);

        assertEquals(cdrList, ListMethods.cdr(list));
    }

    @Test
    public void consTest() {
        Atom atom1 = new Atom("first");
        Atom atom2 = new Atom(2L);
        Atom atom3 = new Atom("last");
        List<Atom> list = List.of(atom2, atom3);
        List<Atom> consList = List.of(atom1, atom2, atom3);

        assertEquals(consList, ListMethods.cons(atom1, list));
    }
}