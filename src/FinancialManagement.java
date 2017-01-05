import java.util.Scanner;

/**
 * Created by USER on 19-07-2016.
 */
class FinancialManagement    {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double sum=0;
        for(int i=0;i<12;i++)
        {
            sum+=in.nextDouble();
        }
        sum=Math.round((sum/12)*100);
        sum/=100;
        System.out.println("$"+sum);
    }
}
