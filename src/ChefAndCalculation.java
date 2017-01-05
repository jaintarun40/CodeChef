import java.util.Scanner;

/**
 * Created by USER on 10-09-2016.
 */
class ChefAndCalculation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            int[] score=new int[n];
            for(int j=0;j<n;j++)
            {
                int c=in.nextInt();
                int cookie=0,newCookie=0;
                int[] coll=new int[6];
                for(int x=0;x<6;x++)
                {
                    coll[x]=0;
                }
                for(int k=0;k<c;k++)
                {
                    cookie=in.nextInt();
                    if(coll[cookie-1]==0)
                    {
                        newCookie++;
                    }
                    coll[cookie-1]++;
                }
                score[j]+=c;
                if(newCookie==4)
                {
                    score[j]+=1;
                }
                if(newCookie==5)
                {
                    score[j]+=2;
                }
                if(newCookie==6)
                {
                    score[j]+=4;
                }
            }
            int best=0,ind=0;
            String result="";
            for(int m=0;m<n;m++)
            {
                if(score[m]>best)
                {
                    best=score[m];
                    result=Integer.toString(m);
                    ind=m;
                }
                else if(score[m]==best)
                {
                    result="tie";
                }
            }
            if(result.equals("0"))
            {
                result="chef";
            }
            if(!((result.equals("tie"))||(result.equals("chef"))))
            {
                result=Integer.toString(Integer.parseInt(result)+1);
            }
            System.out.println(result);
        }
    }
}
