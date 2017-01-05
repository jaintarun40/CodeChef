import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by USER on 30-07-2016.
 */
class LumpyTheBusDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int p=in.nextInt();
            int q=in.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=in.nextInt();
            }
            Arrays.sort(a);
            int done=0;
            for(int j=0;j<n;j++)
            {
                int amt=a[j];
                if(amt<=((q*2)+p))
                {
                    if(q>0)
                    {
                        if((q*2)>=amt)
                        {
                            q=q-(amt/2);
                            p=p-(amt%2);
                            done++;
                        }
                        else
                        {
                            p=p-(amt-(q*2));
                            q=0;
                            done++;
                        }
                    }
                    else if(p>0)
                    {
                        p=p-amt;
                        done++;
                    }
                }
                else
                {
                    break;
                }
            }
            System.out.println(done);
        }
    }
}
