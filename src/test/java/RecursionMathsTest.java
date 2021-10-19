import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecursionMathsTest {

    private RecursionMaths maths = new RecursionMaths();

    @Test
    public void plusTest() {
        Long n = 5L;
        Long m = 6L;
        Long answer = 11L;
        Long computedAnswer = maths.plus(n, m);
        assertEquals(answer, computedAnswer);
    }

    @Test
    public void minusTest() {
        Long n = 17L;
        Long m = 6L;
        Long answer = 11L;
        Long computedAnswer = maths.minus(n, m);
        assertEquals(answer, computedAnswer);
    }
}