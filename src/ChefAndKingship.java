import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by USER on 10/01/2017.
 */
class ChefAndKingship {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int[] p=new int[n];
            for(int j=0;j<n;j++)
            {
                p[j]=in.nextInt();
            }
            Arrays.sort(p);
            long ans=0;
            for(int j=1;j<n;j++)
            {
                ans+=p[0]*p[j];
            }
            System.out.println(ans);
        }
    }
}
