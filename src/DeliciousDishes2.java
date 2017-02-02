import java.util.Scanner;

/**
 * Created by varun on 31/1/17.
 */
class DeliciousDishes2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++)
        {
            long l = in.nextLong();
            long r = in.nextLong();
            String lString = Long.toString(l);
            String rString = Long.toString(r);
            for(int j = lString.length(); j < rString.length() && j < 10;j++)
            {
                int x = (fact(9)/(fact(9-j)*fact(j)));

            }
        }
    }
    public static int fact(int num)
    {
        int fact=1, i;
        for(i=1; i<=num; i++)
        {
            fact = fact*i;
        }
        return fact;
    }
}
