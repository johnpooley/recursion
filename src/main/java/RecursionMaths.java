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

    public Long minus(int n, int m) {
        if (m == 0L) {
            return (long) n;
        }
        logger.info("shrink by one");
        return -1L + minus((long) n, ((long) m - 1L));
    }

    public Long addTup(List<Long> tup) {
        if (tup == null || tup.isEmpty()) {
            logger.info("end of line");
            return 0L;
        }
        logger.info(String.valueOf(tup.get(0)));
        return plus(tup.get(0), addTup(tup.subList(1, tup.size())));
    }
}
