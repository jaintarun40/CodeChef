import java.util.Scanner;

class MagincOperations
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i=0;i<t;i++)
        {
            int x=in.nextInt();
            int k=in.nextInt();
            int[] n=new int[k];
            int[] d=new int[k];
            for(int j=0;j<k;j++)
            {
                n[j]=in.nextInt();
            }
            for(int j=0;j<k;j++)
            {
                d[j]=in.nextInt();
            }
            double x1=x;
            for(int j=0;j<k;j++)
            {
                //System.out.println(n[j]+" "+d[j]);
                double s=(double) n[j]/d[j];
                //System.out.println(s);
                s=s*x1;
                x1=x1+s;
            }
            //System.out.println(x1);
            double per=((x1-x)/x1)*100;
            long per1=(long) per;
            System.out.println(per1);
        }
    }
}