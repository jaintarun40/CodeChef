/**
 * Created by USER on 11/01/2017.
 */
class Pattern1 {
    public static void main(String[] args) {
        int num=1, times=1;
        int space=3;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=times;j++)
            {
                System.out.print(num);
                num++;
            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            space--;
            times+=2;
            System.out.println();
        }
        space=1;
        times=5;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=times;j++)
            {
                System.out.print(num);
                num++;
            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            space++;
            times-=2;
            System.out.println();
        }
    }
}
