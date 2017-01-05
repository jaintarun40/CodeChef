import java.util.Scanner;

/**
 * Created by USER on 18-09-2016.
 */
class TheLostArithmeticSequence {
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
            int ans=-1;
            int[] temp=new int[n-1];
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<j;k++)
                {
                    temp[k]=a[k];
                }
                for(int k=j+1;k<n;k++)
                {
                    temp[k-1]=a[k];
                }
                if(checkAP(temp)==1)
                {
                    if(ans==-1)
                    {
                        ans=a[j];
                    }
                    else if(a[j]<ans)
                    {
                        ans=a[j];
                    }
                }
            }
            System.out.println(ans);
        }
    }
    public static int checkAP(int[] a)
    {
        if(a.length>=2) {
            int iDiff = a[1] - a[0];
            for (int i = 0; i < a.length - 1; i++) {
                if ((a[i + 1] - a[i]) != iDiff)
                    return -1;
            }
            return 1;
        }
        else return 1;
    }
}
