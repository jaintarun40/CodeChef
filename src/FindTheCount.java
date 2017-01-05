/**
 * Created by USER on 19-07-2016.
 */
import java.util.Scanner;

class FindTheCount
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++)
        {
            int count=0;
            String s=in.nextLine();
            String s2=in.nextLine();
            int len=s2.length();
            for(int j=0;j<s.length()-len+1;j++)
            {
                String subs=s.substring(j,j+len);
                if(subs.equals(s2))
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

