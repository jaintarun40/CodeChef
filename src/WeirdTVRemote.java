import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by USER on 06/01/2017.
 */
class WeirdTVRemote {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String channel=in.nextLine();
        int pos=1;

        for(int i=0;i<channel.length();i++)
        {
            int to=(int) channel.charAt(i)-64;
            int rightLeft=Math.abs(to-pos);
            int posi=pos%5;
            int posf=to%5;
            int updown=Integer.MAX_VALUE;
            if((pos/5)<(to/5) || (pos/5)>(to/5))
            {
                updown=Math.abs((pos/5)-(to/5))+Math.abs(posi-posf);
            }
            if(updown<rightLeft)
            {
                while(pos!=to)
                {
                    if(pos<to)
                    {
                        if((pos/5)<(to/5))
                        {
                            System.out.println("Move Down");
                            pos=pos+5;
                        }
                        else
                        {
                            System.out.println("Move Right");
                            pos++;
                        }
                    }
                    else
                    {
                        if((pos/5)>(to/5))
                        {
                            System.out.println("Move Up");
                            pos=pos-5;
                        }
                        else
                        {
                            System.out.println("Move Left");
                            pos--;
                        }
                    }
                }
                System.out.println("Press OK");
            }
            else
            {
                while(pos!=to)
                {
                    if(pos<to)
                    {
                        System.out.println("Move Right");
                        pos++;
                    }
                    else
                    {
                        System.out.println("Move Left");
                        pos--;
                    }
                }
                System.out.println("Press OK");
            }
        }
    }
}
