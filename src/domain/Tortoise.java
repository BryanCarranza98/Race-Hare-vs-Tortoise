package domain;
import org.apache.logging.log4j.*;
import java.awt.*;
import java.util.Random;

public class Tortoise extends RaceParticipant
{

    private static final String LONG_SPACES = "                                     ";
    private static Logger logger = LogManager.getLogger(Tortoise.class);
    private static final int DEFAULT_START_DISTANCE = 1;
    private static final int DEFAULT_SLEEP_PERCENT = 15;
    private static final int DEFAULT_TOP_SPEED = 3;


    public Tortoise()
    {

        super();
        logger.debug("INSIDE    TORTOISE DEFAULT CONSTRUCTOR");
        setInternalAttributes(DEFAULT_START_DISTANCE
                ,DEFAULT_SLEEP_PERCENT,
                DEFAULT_TOP_SPEED);
    }

    public Tortoise(int startingDistance )
    {
        super();
        logger.debug("INSIDE    TORTOISE DEFAULT CONSTRUCTOR");
        setInternalAttributes(startingDistance,DEFAULT_SLEEP_PERCENT,DEFAULT_TOP_SPEED);
    }

    public Tortoise(int startingDistance, int sleepPercent )
    {
        super();
        logger.debug("INSIDE    TORTOISE DEFAULT CONSTRUCTOR");
        setInternalAttributes(startingDistance,sleepPercent,DEFAULT_TOP_SPEED);
    }

    public Tortoise(int startingDistance, int sleepPercent, int topSpeed )
    {
        super();
        logger.debug("INSIDE    TORTOISE DEFAULT CONSTRUCTOR");
        setInternalAttributes(startingDistance,sleepPercent,topSpeed);
    }






    public Tortoise(Random generator, int startingDistance ) // passing this to the 3rd constructor
    {
        this(generator, startingDistance, DEFAULT_SLEEP_PERCENT );

        // super();
        // setInternalAttributes(startingDistance,DEFAULT_SLEEP_PERCENT, DEFAULT_TOP_SPEED);

        logger.debug("INSIDE    TORTOISE GENERATOR 2-ARG CONSTRUCTOR");

    }

    public Tortoise(Random generator, int startingDistance, int sleepPercent )
    {

        this(generator, startingDistance, sleepPercent, DEFAULT_TOP_SPEED);

        // super();
        // setInternalAttributes(startingDistance,sleepPercent, DEFAULT_TOP_SPEED);


        logger.debug("INSIDE    TORTOISE GENERATOR 3-ARG CONSTRUCTOR");

    }

    public Tortoise(Random generator, int startingDistance, int sleepPercent, int topSpeed )
    {
        super(generator); // PASS IT TO PARENT
        logger.debug("INSIDE    TORTOISE GENERATOR 4-ARG CONSTRUCTOR");
        setInternalAttributes(startingDistance,sleepPercent,topSpeed); // CALLING OUR SETTERS
    }









    private void setInternalAttributes(int startingDistance,
                                       int sleepPercent,
                                       int topSpeed)
    {   // owned by the parent
        this.totalDistance = startingDistance;
        this.sleepPercent = sleepPercent;
        this.topSpeed = topSpeed;

    }


    @Override
    public void paint(Graphics g, int y)
    {
        if (g != null)
        {
            g.setColor(Color.BLUE);
            g.fillArc(totalDistance, y, 20, 10, 0, 180);
            g.fillOval(totalDistance+17, y-3, 6, 6);
        }
    }

    @Override
    public void display()
    {
        //String fakeOutput = LONG_SPACES.substring(0,totalDistance)+ "o~";


        String space = " "; // replicate x number of times
        String output = String.format("%0" + totalDistance + "d" , 0).replace("0", space) + "O~"; //generating the string

        System.out.println(output);
    }

    @Override
    public int sprint()
    {
        int sleep = generator.nextInt(100);
        int sprintDistance = 0;

        if (sleep > sleepPercent)
        {
            // this means he is "running" / "sprinting"
            sprintDistance = generator.nextInt(topSpeed) + 1 ;

        }

        totalDistance += sprintDistance;
        return sprintDistance;
    }
}
