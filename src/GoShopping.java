import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Jain on 7/24/2016.
 */
class GoShopping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t=in.nextLong();
        for(int i=0;i<t;i++)
        {
            long credits=in.nextLong();
            int noItems=in.nextInt();
            long[] prices=new long[noItems];
            for(int j=0;j<noItems;j++)
            {
                prices[j]=in.nextLong();
            }
            int flag=0;
            int pos1=0,pos2=0;
            for(int j=0;j<noItems;j++)
            {
                for(int k=j+1;k<noItems;k++)
                {
                    if((prices[j]+prices[k]==credits)&&(j!=k)&&(j<k))
                    {
                        pos1=j;
                        pos2=k;
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                {
                    break;
                }
            }
            System.out.println("Shop"+(i+1)+": "+(pos1+1)+" "+(pos2+1));
        }
    }

}
