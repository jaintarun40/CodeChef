import java.util.Scanner;

/**
 * Created by USER on 18-09-2016.
 */
class LazyJem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            long n=in.nextLong();
            long b=in.nextLong();
            long m=in.nextLong();
            long time=0;
            while(n>0)
            {
                if(n%2==0)
                {
                    time+=((n/2)*m);
                    n=n-(n/2);
                    if(n>0)
                        time+=b;
                    m=2*m;
                }
                else
                {
                    time+=(((n+1)/2)*m);
                    n=n-((n+1)/2);
                    if(n>0)
                        time+=b;
                    m=m*2;
                }
            }

            System.out.println(time);
        }
    }
}
