import java.util.Scanner;

/**
 * Created by USER on 01-08-2016.
 */
class LongestEvenSubarrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=in.nextInt();
            }
            int len=0;
            int x=0;
            int pos1=0,pos2=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]%2!=0&&x==0)
                {
                    pos1=j;
                    x++;
                }
                else if(a[j]%2!=0&&x!=0)
                {
                    pos2=j;
                    x++;
                }
            }
            if(x%2==0)
            {
                len=a.length;
            }
            else
            {
                if(((a.length)-pos1-1)>(pos2+1))
                {
                    len=(a.length)-pos1-1;
                }
                else
                {
                    len=pos2+1;
                }
            }

            System.out.println(len);
        }
    }
}
