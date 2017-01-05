import java.util.Scanner;

/**
 * Created by USER on 06-10-2016.
 */
class LittleElephantAndMouses {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int m=in.nextInt();
            int[][] a=new int[n][m];
            String x="";
            in.nextLine();
            for(int j=0;j<n;j++)
            {
                x=in.nextLine();
                for(int k=0;k<m;k++)
                {
                    a[j][k]=Integer.parseInt(x.substring(k,k+1));
                }
            }
            int scared=0;
            if(a[0][0]==0)
            {
                scared++;
            }
            int cx=0,cy=0;
            while(cx<n-1||cy<m-1)
            {
                if(a[cx+1][cy]==1)
                {

                }
            }
        }
    }
}
