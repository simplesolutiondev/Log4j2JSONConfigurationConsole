package simplesolution.dev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2JSONConfigurationConsoleExample {

    private static final Logger logger = LogManager.getLogger(Log4j2JSONConfigurationConsoleExample.class.getName());

    public static void main(String... args) {
        logger.trace("Trace message");
        logger.info("Info message");
        logger.debug("Debug message");
        logger.warn("Warn message");
        logger.error("Error message");
        logger.fatal("Fatal message");
    }
}
