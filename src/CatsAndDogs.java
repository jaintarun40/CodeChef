import java.util.Scanner;

/**
 * Created by USER on 06/01/2017.
 */
class CatsAndDogs {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            long c=in.nextLong();
            long d=in.nextLong();
            long l=in.nextLong();
            System.out.println(checkValid(c,d,l));
        }
    }
    public static String checkValid(long c, long d, long l)
    {
        if(l%4!=0)
        {
            return "no";
        }
        else if((l>(c+d)*4))
        {
            return "no";
        }
        else if(l<(d+((c>2*d)?(c-(2*d)):0))*4)
        {
            return "no";
        }
        return "yes";
    }
}
