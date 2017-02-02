import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by varun on 2/2/17.
 */
class ChefOfTheYear {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[];
        s=br.readLine().split(" ");
        int N=Integer.parseInt(s[0]);
        int M=Integer.parseInt(s[1]);
        HashMap<String,String> map = new HashMap<String, String>();
        HashMap<String,Integer> chef = new HashMap<String, Integer>();
        HashMap<String,Integer> country = new HashMap<String, Integer>();
        int i,maxchef=0,maxcountry=0;
        for(i=0;i<N;i++)
        {
            s = br.readLine().split(" ");
            map.put(s[0],s[1]);
            chef.put(s[0],0);
            country.put(s[1],0);
        }
        for(i=0;i<M;i++)
        {
            s = br.readLine().split(" ");
            chef.put(s[0],chef.get(s[0])+1);
            country.put( map.get(s[0]) , country.get ( map.get(s[0]) )+1  );

            if((int)(chef.get(s[0]))  >  maxchef)
                maxchef=(int)(chef.get(s[0]));

            if((int)(country.get(map.get(s[0])))>maxcountry)
                maxcountry = (int)(country.get(map.get(s[0])));
        }
        String scountry="zzzzzzzzzzzzzzzzz";
        String schef="zzzzzzzzzzzzzzz";
        /*System.out.println();
        for(String s2 : chef.keySet())
            System.out.println(s2 + " "+ chef.get(s2));
        System.out.println();
        for(String s2 : country.keySet())
            System.out.println(s2 + " "+ country.get(s2));
        System.out.println();
        System.out.println();*/
        for(String s2 : chef.keySet())
        {
            if((int)chef.get(s2)==maxchef)
            {
                if(s2.compareTo(schef)<0)
                    schef = s2;
            }
        }

        for(String s2 : country.keySet())
        {
            if((int)country.get(s2)==maxcountry)
            {
                if(s2.compareTo(scountry)<0)
                    scountry = s2;
            }
        }
        System.out.println(scountry);
        System.out.println(schef);
    }
}