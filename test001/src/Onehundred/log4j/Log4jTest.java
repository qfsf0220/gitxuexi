package Onehundred.log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jTest {

        private static String qf = "qf";
        private static Logger logger= LogManager.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        for (int i = 1;i<=5;i++){
            logger.warn("hello "+i);
        }
            logger.info("this is a info"+qf);
            logger.warn("this is a warning");
            logger.debug("this is a debug ");
            logger.error("this is a error");
            logger.fatal("this is a fatal ");


    }
}
