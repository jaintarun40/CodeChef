import java.util.Scanner;

/**
 * Created by USER on 10/01/2017.
 */
class FantasticFour {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int q=in.nextInt();
            long p=in.nextLong();
            int[] a=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=in.nextInt();
            }
            in.nextLine();
            for(int j=0;j<q;j++)
            {
                int type=in.nextInt();
                int arg1=in.nextInt();
                int arg2=in.nextInt();
                if(type==1)
                {
                    a[arg1-1]=arg2;
                }
                else if(type==2)
                {
                    long prod=1;
                    for(int k=arg1-1;k<arg2;k++)
                    {
                        prod=prod*a[k];
                    }
                    //System.out.println(prod);
                    boolean flag=false;
                    for(int g=0;g<p&&flag==false;g++)
                    {
                        for(int h=0;h<p&&flag==false;h++)
                        {
                            for(int v=0;v<p&&flag==false;v++)
                            {
                                for(int b=0;b<p&&flag==false;b++)
                                {
                                    //System.out.println(g+" "+h+" "+v+" "+b+"l"+p);
                                    if((Math.pow(g,2)+Math.pow(h,2)+Math.pow(v,2)+Math.pow(b,2))==prod)
                                    {
                                        System.out.println(g+" "+h+" "+v+" "+b);
                                        flag=true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
