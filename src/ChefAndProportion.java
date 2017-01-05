import java.util.Scanner;

/**
 * Created by USER on 24-07-2016.
 */
class ChefAndProportion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a=new int[4];
        for(int i=0;i<4;i++)
        {
            a[i]=in.nextInt();
        }
        int[] b=new int[4];
        b=a;
        int flag=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(((float)b[0]/b[1])==((float) b[2]/b[3]))
                {
                    flag=1;
                    break;
                }
                else
                {
                    b=a;
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("Possible");
        }
        else
        {
            System.out.println("Impossible");
        }
    }
}
