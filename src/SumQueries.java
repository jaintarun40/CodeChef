import java.util.Scanner;

/**
 * Created by USER on 05/01/2017.
 */
class SumQueries {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long m=in.nextLong();
        long[] a=new long[(int)m];
        for(int i=0;i<m;i++)
        {
            a[i]=in.nextLong();
        }
        for(long i=0;i<m;i++)
        {
            int count=0;
            for(long j=1;j<=n;j++)
            {
                for(long k=n+1;k<=(2*n);k++)
                {
                    if(j+k==a[(int)i])
                    {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
