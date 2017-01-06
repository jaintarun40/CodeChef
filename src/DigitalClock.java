import java.util.Scanner;

/**
 * Created by USER on 06/01/2017.
 */
class DigitalClock {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int h=in.nextInt();
            int m=in.nextInt();
            //System.out.println(h+" "+m);
            int res=0;
            if(h>0&&m>0)
            {
                res++;
            }
            for(int j=1;j<=(h<=9?h:9);j++)
            {
                for(int k=j;k<m;k=(k*10)+k)
                {
                    //System.out.println(j+" "+k);
                    if(k<m)
                    res++;
                }
            }
            if(h>10)
            {
                for(int j=11;j<h;j=j+11)
                {
                    for(int k=(j/10);k<m;k=(k*10)+k)
                    {
                        //System.out.println(j+" "+k);
                        if(k<m)
                            res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
