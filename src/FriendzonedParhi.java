import java.util.Scanner;

/**
 * Created by Tarun on 15/01/2017.
 */
class FriendzonedParhi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++)
        {
            String s=in.nextLine();
            int max=0;
            Integer p1=null;
            Integer p2=null;
            for(int j=0;j<s.length();j++)
            {
                if(isVowel(s.charAt(j)))
                {
                    if(p1==null)
                    {
                        p1=j;
                        p2=j;
                        if((p2-p1+1)>max)
                        {
                            max=(p2-p1+1);
                        }
                    }
                    else if(p1!=null)
                    {
                        p2=j;
                        if((p2-p1+1)>max)
                        {
                            max=(p2-p1+1);
                        }
                    }
                }
                else
                {
                    p1=null;
                    p2=null;
                }
            }
            System.out.println(max);
        }
    }
    public static boolean isVowel(char x)
    {
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
        {
            return true;
        }
        else return false;
    }
}
