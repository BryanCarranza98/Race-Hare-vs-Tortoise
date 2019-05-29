package tempthreads;

import org.apache.logging.log4j.*;


public class Thread02 extends Thread
{
    private static Logger logger = LogManager.getLogger(Thread02.class);

    @Override
    public void run()
    {
        super.run();


        /* the "calling code" calls START, and then when the
          JVM runtime engine gets around to it, and it feels like it,
          it will magically call this "run" method  */

        for(int j=0; j <100; j++ )
        {
            logger.debug("J = " + j);


            // pause and simulate a long running process
            try
            {
                Thread.sleep(300);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }





}
