import java.util.Scanner;

/**
 * Created by USER on 28-07-2016.
 */
class HitTheBit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int l=in.nextInt();
            int r=in.nextInt();
            int k=in.nextInt();
            int sum=0;
            for(int j=l;j<=r;j++)
            {
                String bin=Integer.toBinaryString(j);
                int length=bin.length();
                int m=length;
                String temp="";
                //if(length<k)
                while((m%4!=0)&&(m<=k))
                {
                    temp=temp+"0";
                    m++;
                }
                temp=temp+bin;
                bin=temp;

                if(bin.charAt(bin.length()-k)=='1')
                {
                    sum+=j;
                }
            }
            System.out.println(sum);
        }
    }
}
