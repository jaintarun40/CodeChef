import java.util.Scanner;

/**
 * Created by USER on 07/01/2017.
 */
class TheNecklace {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            long s=(long) Math.pow(2,n);
            s--;
            System.out.println(s%100000);
        }
    }
}
