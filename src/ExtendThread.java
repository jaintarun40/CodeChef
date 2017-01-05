/**
 * Created by USER on 19/11/2016.
 */
class ExtendThread extends Thread{
    ExtendThread()
    {
        super("Demo Thread");
        start();
    }
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Child Thread: "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Demo Thread exiting.");
    }
}
class ThreadDriver
{
    public static void main(String args[])
    {
        Thread t=Thread.currentThread();
        new ExtendThread();
        for(int i=0;i<5;i++)
        {
            System.out.println("Main Thread: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main Thread exiting.");
    }
}
