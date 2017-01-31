import java.util.Scanner;

/**
 * Created by varun on 25/1/17.
 */
class TheLeakingRobot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(int i=0;i<t;i++)
        {
            long x = in.nextLong();
            long y = in.nextLong();
            boolean xAxis = ((x%2 == 0 && x<0) || (x%2==1 && x>0));
            boolean yAxis = (y%2==0);
            if(xAxis && yAxis)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
