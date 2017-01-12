import java.util.Scanner;

/**
 * Created by USER on 10/01/2017.
 */
class Reservoir {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            sc.nextLine();
            String reserv=new String();
            char[][] res=new char[n][m];
            for(int j=0;j<n;j++)
            {
                reserv=sc.nextLine();
                for(int k=0;k<reserv.length();k++)
                {
                    res[j][k]=reserv.charAt(k);
                }
            }
            boolean flag=false;
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<m;k++)
                {
                    if(res[j][k]=='B')
                    {
                        if(j<n-1)
                        {
                            if(res[j+1][k]!='B')
                            {
                                flag=true;
                                break;
                            }
                        }
                    }
                    else if(res[j][k]=='W')
                    {
                        if(k==0||k==m-1)
                        {
                            flag=true;
                            break;
                        }
                    }
                }
            }
        }
    }
}
