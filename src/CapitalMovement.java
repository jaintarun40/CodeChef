import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by USER on 06/01/2017.
 */
class CapitalMovement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            long[] p=new long[n];
            for(int j=0;j<n;j++)
            {
                p[j]=in.nextLong();
            }
            HashMap<Integer,ArrayList<Integer>> teleports= new HashMap<Integer, ArrayList<Integer>>();
            for(int j=0;j<n-1;j++)
            {
                int key=in.nextInt();
                int val=in.nextInt();
                teleports.putIfAbsent(key,new ArrayList<Integer>());
                teleports.get(key).add(val);
                teleports.putIfAbsent(val,new ArrayList<Integer>());
                teleports.get(val).add(key);
            }
            for(int j=1;j<=n;j++)
            {
                teleports.putIfAbsent(j,new ArrayList<Integer>());
            }
            for(int j=0;j<n;j++)
            {
                ArrayList<Integer> ar=teleports.get(j+1);
                long max=0;
                int ind=-1;
                for(int k=0;k<n;k++)
                {
                    if(!((k==j) || (ar.contains(k+1))))
                    {
                        if(p[k]>max)
                        {
                            max=p[k];
                            ind=k+1;
                        }
                    }
                }
                System.out.print(ind+" ");
            }
        }
    }
}
