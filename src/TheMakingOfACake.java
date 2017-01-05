import java.util.Scanner;

/**
 * Created by USER on 23-07-2016.
 */
class TheMakingOfACake {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int d=in.nextInt();
            in.nextLine();
            String demand=in.nextLine();
            String supply=in.nextLine();
            int flag2=0;
            for(int j=0;j<supply.length();j++)
            {
                if(supply.charAt(j)!=demand.charAt(j))
                {
                    int flag=0;
                    for(int k=j;k<supply.length();k=k+d)
                    {
                        if(supply.charAt(k)==demand.charAt(j))
                        {
                            flag=1;
                            break;
                        }
                    }
                    for(int k=j;k>=0;k=k-d)
                    {
                        if(supply.charAt(k)==demand.charAt(j))
                        {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)
                    {
                        //System.out.println("No");
                        flag2=1;
                        break;
                    }
                }
            }
            if(flag2==0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
