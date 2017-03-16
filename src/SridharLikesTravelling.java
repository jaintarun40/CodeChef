import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by varun on 15/3/17.
 */
public class SridharLikesTravelling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0;i < t;i++) {
            int n = in.nextInt();
            in.nextLine();
            int costSum = 0;
            String start="";
            Map<String, String> city = new HashMap<String, String>();
            ArrayList<String> tails = new ArrayList<String>();
            for(int j = 0;j < n-1;j++) {
                String[] inp  = new String[3];
                String city1, city2, cost="";
                inp = in.nextLine().split(" ");
                city1 = inp[0];
                city2 = inp[1];
                costSum += Integer.parseInt(inp[2].substring(0,inp[2].length()-1));
                city.put(city1,city2);
                tails.add(city1);
                for(int k = 0; k < tails.size();k++) {
                    if(!((city.containsValue(tails.get(k)))&&(city.containsKey(tails.get(k))))) {
                        start=tails.get(k);
                        break;
                    }
                }
            }

            String cur=start;
            //System.out.println(cur+" "+start);
            for(int k=0;k<n-1;k++) {
                System.out.println(cur+" "+city.get(cur));
                cur=city.get(cur);
            }
            System.out.println(costSum);
        }
    }
}
