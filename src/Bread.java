import java.util.Scanner;

/**
 * Created by varun on 16/3/17.
 */
class Bread {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for(int i = 0;i < t;i++) {
            int n = in.nextInt();
            long k = in.nextLong();
            int ans = 0;
            long cur=0;
            int[] a = new int[n];

            for(int j=0;j<n;j++) {
                a[j] = in.nextInt();
            }

            /*implementation*/
            for(int j=0;j<n;j++) {
                if(a[j]<=cur) {
                    cur-=a[j];
                }
                else {
                    ans+=Math.ceil((float) (a[j]-cur)/k);
                    cur=k-((a[j]-cur)%k);
                }
                if(cur>0)
                cur--;
            }
            System.out.println(ans);
        }
    }
}
