import java.util.Scanner;

/**
 * Created by USER on 12-09-2016.
 */
class GearsOfWar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0;i<q;i++)
        {
            int a=in.nextInt();
            if(a%2==0)
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
