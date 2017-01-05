import java.util.Scanner;

/**
 * Created by USER on 23-07-2016.
 */
class OrmieAndTheCookie {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            long h=in.nextLong();
            long[][] a=new long[n][2];
            for(int j=0;j<n;j++)
            {
                a[j][0]=in.nextLong();
                a[j][1]=in.nextLong();
            }
            double min=((double) (a[0][0]-a[0][1])/(a[0][0]+a[0][1]));
            int pos=0;
            for(int j=0;j<n;j++)
            {
                if(min<((double) (a[j][0]-a[j][1])/(a[j][0]+a[j][1])))
                {
                    min=((double) (a[j][0]-a[j][1])/(a[j][0]+a[j][1]));
                    pos=j;
                }
                //System.out.println("Value= "+((double) (a[j][0]-a[j][1])/(a[j][0]+a[j][1])));
            }
            long steps=calcSteps(a[pos][0],a[pos][1],h);
            System.out.println(steps);
        }
    }
    public static long calcSteps(long u, long d, long h)
    {
        long steps=0;
        long cHeight=0;
        while(cHeight<(h-u))
        {
            steps+=(u+d);
            cHeight+=(u-d);
        }
        if(cHeight<h)
        {
            steps+=(h-cHeight);
        }
        return steps;
    }
}
