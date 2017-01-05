import java.util.Scanner;

/**
 * Created by USER on 30-07-2016.
 */
class DrumpfForPresident {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int k=in.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=in.nextInt();
                b[j]=0;
            }

            for(int j=0;j<n;j++)
            {
                if(a[j]==j+1)
                {
                    b[a[j]-1]=-1;
                }
                else if(b[a[j]-1]==-1)
                {
                    b[a[j]-1]=-1;
                }
                else
                {
                    b[a[j]-1]++;
                }
            }
            int size=0;
            for(int j=0;j<n;j++)
            {
                if(b[j]>=k)
                {
                    size++;
                }
            }
            System.out.println(size);
        }
    }
}
