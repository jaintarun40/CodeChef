import java.util.Scanner;

/**
 * Created by USER on 03-08-2016.
 */
class SinchanAndCake {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int l=in.nextInt();
            int b=in.nextInt();
            for(int j=1;j<=n;j++)
            {
                if(l>0&&b>0)
                {
                    if(l>b)
                    {
                        l-=b;
                    }
                    else
                    {
                        b-=l;
                    }
                }
                else
                {
                    break;
                }
            }
            if(l>0&&b>0)
            {
                System.out.println("Yes "+(l*b));
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
