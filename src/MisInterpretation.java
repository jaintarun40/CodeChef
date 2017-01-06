import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 06/01/2017.
 */


class Misinterpretation {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] wordArr = new int[N];
            int[] transformedArr = new int[N];


            for(int j = 0; j < N; j++) {
                wordArr[j] = j;
            }


            int count = 0;
            for(int k = 1; k < N; k+=2) {
                transformedArr[count] = k;
                count++;
            }

            for(int j = 0; j < N; j+=2) {
                transformedArr[count] = j;
                count++;
            }

            for(int j = 0; j < N; j++) {
                if(wordArr[j] != transformedArr[j]) {
                    int x = j;
                    while(wordArr[x] != transformedArr[x]) {
                        int temp = transformedArr[x];
                        transformedArr[x] = wordArr[x];
                        wordArr[temp] = wordArr[x];
                        x = temp;
                    }
                }
            }
            int counter = 0;
            for(int j = 0; j < N; j++) {
                if(wordArr[j] == j) {
                    counter++;
                }
            }


            long result = 1;
            for(int j = 0; j < counter; j++) {
                result = result * 26 % 1000000007;
            }

            System.out.println(result);
        }
    }

}