import model.Atom;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RecursionMathsTest {

    private final RecursionMaths maths = new RecursionMaths();

    @Test
    public void plusTest() {
        Long n = 5L;
        Long m = 6L;
        Long answer = 11L;
        Long computedAnswer = maths.plus(n, m);
        assertEquals(answer, computedAnswer);
    }

    @Test
    public void plusIntTest() {
        int n = 5;
        int m = 6;
        Long answer = 11L;
        Long computedAnswer = maths.plus(n, m);
        assertEquals(answer, computedAnswer);
    }

    @Test
    public void plusAtomTest() {
        Atom n = new Atom(5L);
        Atom m = new Atom(6L);
        Long answer = 11L;
        Atom computedAnswer = maths.plus(n, m);
        assertEquals(answer, computedAnswer.getNumber());
    }

    @Test
    public void plusAtomWithWordTest() {
        Atom n = new Atom(5L);
        Atom m = new Atom("word");
        Long answer = 5L;
        Atom computedAnswer = maths.plus(m, n);
        assertEquals(answer, computedAnswer.getNumber());
    }

    @Test
    public void minusTest() {
        Long n = 17L;
        Long m = 6L;
        Long answer = 11L;
        Long computedAnswer = maths.minus(n, m);
        assertEquals(answer, computedAnswer);
    }

    @Test
    public void addTupTest() {
        List<Long> tup = List.of(1L, 2L, 3L, 4L);
        Long answer = 10L;
        assertEquals(answer, maths.addTup(tup));
    }

    @Test
    public void minusIntTest() {
        int n = 17;
        int m = 6;
        Long answer = 11L;
        Long computedAnswer = maths.minus(n, m);
        assertEquals(answer, computedAnswer);
    }
}