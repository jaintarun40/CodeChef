import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by varun on 31/1/17.
 */
class DeliciousDishes {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for(int i=0;i<t;i++)
        {
            long l = in.nextLong();
            long r = in.nextLong();
            long max = 1000000000;
            long answer = 0;

            for(long j=l;j<=r && j < max;j++)
            {
                int[] a = new int[10];
                //System.out.println("Hello1");
                boolean flag = true;
                String number = Long.toString(j);
                for(int k=0;k<number.length();k++)
                {
                    //System.out.println("Hello2");
                    if(a[Character.getNumericValue(number.charAt(k))]>0)
                    {
                        flag=false;
                    }
                    else
                    {
                        a[Character.getNumericValue(number.charAt(k))]++;
                    }
                }
                if(flag == true)
                {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
