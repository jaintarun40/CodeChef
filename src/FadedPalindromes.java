import java.util.Scanner;

/**
 * Created by USER on 08-09-2016.
 */
class FadedPalindromes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++)
        {
            StringBuilder s=new StringBuilder(in.nextLine());
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='.')
                {
                    if(j<(s.length()/2))
                    {
                        s.setCharAt(j,s.charAt(s.length()-(j+1)));
                    }
                    else
                    {
                        if(s.length()%2!=0)
                        {
                            if(j>(s.length()/2))
                            {
                                s.setCharAt(j,s.charAt(s.length()-(j+1)));
                            }
                        }
                        else
                        {
                            if(j>=s.length()/2)
                            {
                                s.setCharAt(j,s.charAt(s.length()-(j+1)));
                            }
                        }
                    }
                }
            }
            StringBuilder temp=new StringBuilder(s);
            StringBuilder s2=new StringBuilder(temp.reverse());
            String sn=new String(s);
            String sr=new String(s2);
            if(sn.equals(sr))
            {
                for(int j=0;j<s.length();j++)
                {
                    if(s.charAt(j)=='.')
                    {
                        s.setCharAt(j,'a');
                    }
                }
                System.out.println(s);
            }
            else
            {
                System.out.println(-1);
            }
        }
    }
}
