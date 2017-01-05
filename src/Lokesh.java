import java.util.Scanner;

/**
 * Created by USER on 28-09-2016.
 */

class Lokesh {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            long a=in.nextLong();
            long b=in.nextLong();
            long prod=a*b;
            System.out.println(prod%9);
        }
    }
}
