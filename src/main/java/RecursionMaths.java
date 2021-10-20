import model.Atom;

import java.util.List;
import java.util.logging.Logger;

public class RecursionMaths {

    Logger logger = Logger.getLogger(RecursionText.class.getName());

    public Long plus(Long n, Long m) {
        if (m == 0L) {
            return n;
        }
        logger.info("increase by one");

        return 1L + plus(n, (m - 1L));
    }

    public Atom plus(Atom n, Atom m) {
        if (m.getNumber() == 0L) {
            return n;
        }
        logger.info("increase by one");

        return new Atom(1L + plus(n, (new Atom(m.getNumber() - 1L))).getNumber());
    }

    public Long plus(int n, int m) {
        if (m == 0L) {
            return (long) n;
        }
        logger.info("increase by one");

        return 1L + plus((long) n, ((long) m - 1L));
    }

    public Long minus(Long n, Long m) {
        if (m == 0L) {
            return n;
        }
        logger.info("shrink by one");
        return -1L + minus(n, (m - 1L));
    }

    public Atom minus(Atom n, Atom m) {
        if (m.getNumber() == 0L) {
            return n;
        }
        logger.info("shrink by one");
        return new Atom(-1L + minus(n, (new Atom(m.getNumber() - 1L))).getNumber());
    }

    public Long minus(int n, int m) {
        if (m == 0L) {
            return (long) n;
        }
        logger.info("shrink by one");
        return -1L + minus((long) n, ((long) m - 1L));
    }

    public Atom addTup(List<Atom> tup) {
        if (tup == null || tup.isEmpty()) {
            logger.info("end of line");
            return new Atom(0L);
        }
        logger.info(String.valueOf(tup.get(0)));
        return plus(ListMethods.car(tup), addTup(ListMethods.cdr(tup)));
    }

    public Atom subOne(Atom n) {
        if (n.getNumber() > 0L) {
            return new Atom(n.getNumber() - 1);
        }
        return new Atom(0L);
    }

    public Atom multiply(Atom n, Atom m) {
        if (m.getNumber() == 0L) {
            return new Atom(0);
        }
        return plus(n, (multiply(n, subOne(m))));
    }
}
