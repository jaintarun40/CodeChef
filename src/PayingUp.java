import java.util.Scanner;

/**
 * Created by USER on 09/01/2017.
 */
class PayingUp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int m=in.nextInt();
            int[] notes=new int[n];
            for(int j=0;j<n;j++)
            {
                notes[j]=in.nextInt();
            }
            if(getResult(notes,m,0))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
    public static boolean getResult(int[] ar,int m, int i)
    {
        if(m<0)
        {
            return false;
        }
        else if(m==0)
        {
            return true;
        }
        if(i>=ar.length)
        {
            return false;
        }

        boolean res1=getResult(ar,m-ar[i],i+1);
        boolean res2=getResult(ar,m,i+1);

        return (res1|res2);
    }
}
