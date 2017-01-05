import java.util.Scanner;

/**
 * Created by USER on 28-09-2016.
 */
class Invigilator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int[][] a=new int[n][n];
            int x=-1,y=-1;
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    a[j][k]=in.nextInt();
                    if(a[j][k]==5)
                    {
                        x=j;
                        y=k;
                    }
                }
            }
            int dis=-1;
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if((a[j][k]==1)&&(x!=-1)&&(y!=-1))
                    {
                        if(dis==-1)
                        {
                            dis=(Math.abs(x-j)+Math.abs(y-k));
                        }
                        else
                        {
                            dis+=(Math.abs(x-j)+Math.abs(y-k));
                        }
                    }
                }
            }
            System.out.println(dis);
        }
    }
}
