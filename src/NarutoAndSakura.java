import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 04-09-2016.
 */
class NarutoAndSakura {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=0;
        try
        {
            t=Integer.parseInt(br.readLine());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        double n=0;
        for(int i=0;i<t;i++)
        {
            try {
                n=Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            int x;
            if(n%2!=0)
                x=(int) Math.ceil(n/2);
            else
                x=(int) ((n/2)-1);
            int sum=0;
            boolean flag=false;
            for(int j=x;j>0;j--)
            {
                sum+=j;
                if(sum==n)
                {
                    flag=true;
                    break;
                }
                if(sum>n)
                    break;
            }
            if(flag==true)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
