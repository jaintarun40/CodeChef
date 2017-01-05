import java.util.Scanner;

/**
 * Created by USER on 06-10-2016.
 */
class PizzaDelivery {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int[] h=new int[n];
            int[] k=new int[n];
            for(int j=0;j<n;j++)
            {
                h[j]=(2*in.nextInt());
            }
            for(int m=0;m<n;m++)
            {
                k[m]=in.nextInt();
            }
            int station=0,prevBalance=0,fuel=0;
            for(int j=0;j<n;j++)
            {
                station=findStation((h[j]-prevBalance),k,n);
                int amount=0;
                if((h[j]-prevBalance)%k[station]==0)
                {
                   fuel+=((h[j]-prevBalance)/k[station]);
                    amount=k[station]*((h[j]-prevBalance)/k[station]);
                }
                else
                {
                    if(k[station]>=(h[j]-prevBalance))
                    {
                        fuel++;
                        amount=k[station];
                    }
                    else
                    {
                        fuel+=Math.ceil((double) ((h[j]-prevBalance)/k[station]));
                        amount=k[station]*(int) (Math.ceil((double) ((h[j]-prevBalance)/k[station])));
                    }
                }
                prevBalance=amount-(h[j]-prevBalance);
            }
            System.out.println(fuel);
        }
    }
    public static int findStation(int dist,int[] k,int n)
    {
        return 1;
    }
}
