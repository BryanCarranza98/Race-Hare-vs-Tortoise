package main;

import gui.MyFrame;

import org.apache.logging.log4j.*;

import javax.swing.*;

public class Driver
{
    private static Logger logger = LogManager.getLogger(Driver.class);

    public static void main(String[] args)
    {
        logger.debug("INSIDE DRIVER MAIN ");
        MyFrame frm = new MyFrame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(600, 400);
        frm.setVisible(true);

        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        /*  this appears to not work (this is on the MAIN thread) */
        ///frm.DOIT();


        logger.debug("LEAVING DRIVER MAIN ");

    }
}
