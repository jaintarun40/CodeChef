import java.util.Scanner;

/**
 * Created by USER on 10/01/2017.
 */
class Approximately {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int k=in.nextInt();
            int a=103993%33102;
            a=a*10;
            int[] ans=new int[k];
            for(int j=0;j<k;j++)
            {
                ans[j]=(a/33102);
                a=(a%33102)*10;
            }
            if (k == 0)
            {
                System.out.println("3");
            }
            else
            {
                System.out.print("3.");
                for(int j=0;j<k;j++)
                {
                    System.out.print(ans[j]);
                }
                System.out.println();
            }
        }
    }
}
