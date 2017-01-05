import java.util.Scanner;

/**
 * Created by USER on 24-09-2016.
 */
class ChefAndInequality {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int d=in.nextInt();
            long sol=0,first=0,last=b;
            if(a<=b&&b<c&&c<=d)
            {
                sol=(b-a+1)*(d-c+1);
            }
            else
            {
                for(int j=c;j<=d;j++)
                {
                    if(a<j)
                    {
                        first=j;
                        break;
                    }
                }
                if(d<b)
                {
                    last=d;
                }
                for(int k=0;k<=(last-a);k++)
                {
                    sol+=(d-first+1-k);
                }
            }

            System.out.println(sol);
        }
    }
}
