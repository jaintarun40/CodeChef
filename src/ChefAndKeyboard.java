import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by USER on 08-10-2016.
 */
class ChefAndKeyboard {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int m=in.nextInt();
            int c=in.nextInt();
            ArrayList<Integer> a=new ArrayList<Integer>();
            int big=0,small=0;
            if(n>m)
            {
                big=n;
                small=m;
            }
            else
            {
                big=m;
                small=n;
            }
            for(int j=1;j<=big;j++)
            {
                if(c%j==0)
                {
                    a.add(j);
                }
            }
            int ans=0;
            if(a.size()>0)
            {
                for(int j=0;j<a.size();j++)
                {
                    for(int k=0;k<a.size();k++)
                    {
                        if(a.get(j)*a.get(k)==c)
                        {
                            if(a.get(j)<=n&&a.get(k)<=m)
                            {
                                ans++;
                                //System.out.println(j+" "+k);
                            }
                        }
                    }
                }
            }
            
            System.out.println(ans);
        }
    }
}
