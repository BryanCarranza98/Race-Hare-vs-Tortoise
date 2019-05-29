package domain;

public class Driver
{

    public static void main(String[] args)
    {
        Tortoise bob = new Tortoise();
        Hare luke = new Hare();

        do{
            bob.sprint();    // outputting the sprint
            bob.display();

            luke.display();
            luke.sprint();

            System.out.println(" -----------------------------"); // the track

            try
            {
                Thread.sleep(200); // how fast
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }


        }while(bob.totalDistance < 40 && luke.totalDistance < 40); // the distance



        if(bob.totalDistance  > luke.totalDistance ) // output if bob beats luke
        {
            System.out.println(" Bob the Tortoise won !!! ");

        }

        if(bob.totalDistance   < luke.totalDistance ) // output if luke beats bob
        {

           System.out.println(" Luke the Hare won !!!");
        }
        


    }





}
