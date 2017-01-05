import java.util.Scanner;

/**
 * Created by USER on 08-09-2016.
 */
class ChefAndDigits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++)
        {
            String x=in.nextLine();
            int one=0,zero=0;
            //System.out.println(x.length());
            for(int j=0;j<x.length();j++)
            {
                if(x.charAt(j)=='0')
                {
                    zero++;
                }
                else if(x.charAt(j)=='1')
                {
                    one++;
                }
            }
            //System.out.println(one+" "+zero);
            if((one>1&&zero>1)||(one==1&&zero==1)||(one==0||zero==0))
            {
                System.out.println("No");
            }
            else
            {
                System.out.println("Yes");
            }
        }
    }
}
