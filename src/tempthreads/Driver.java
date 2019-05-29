package tempthreads;

import org.apache.logging.log4j.*;


public class Driver
{
    private static Logger logger = LogManager.getLogger(Driver.class);

    public static void main(String[] args)
    {
        logger.debug("INSIDE    THREAD  DRIVER  MAIN");

        Thread01 thread01 = new Thread01();
        Thread02 thread02 = new Thread02();

        // always call START -- never call RUN
        thread01.start();
        thread02.start();


        logger.debug("LEAVING   THREAD  DRIVER  MAIN");
    }
}
