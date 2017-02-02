import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by varun on 2/2/17.
 */
class ChefAndFrogs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        long p = in.nextLong();
        long[] a = new long[n];
        long[] sorted = new long[n];

        for(int j = 0; j < n; j++) {
            a[j] = in.nextLong();
            sorted[j] = a[j];
        }

        Arrays.sort(sorted);

        //System.out.println("Hello1");

        for(int l = 0; l < p; l++) {
            int i1 = in.nextInt();
            int i2 = in.nextInt();

            boolean flag = true;

            long num1 = a[i1-1];
            long num2 = a[i2-1];

            int x = Arrays.binarySearch(sorted, (num1<num2) ? num1 : num2);

            //System.out.println("Hello");

            for(int m = x; sorted[m] != num2; m++) {
                if(sorted[m+1]>sorted[m]+k) {
                    flag = false;
                }
            }

            if(flag == true){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
