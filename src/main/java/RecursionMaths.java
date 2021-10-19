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

    public Long minus(Long n, Long m) {
        if (m == 0L) {
            return n;
        }
        logger.info("shrink by one");
        return -1L + minus(n, (m - 1L));
    }
}
