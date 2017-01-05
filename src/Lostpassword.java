import java.util.Scanner;

/**
 * Created by USER on 28-07-2016.
 */
class Lostpassword {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean x=true;
        while(x==true)
        {
            String s=in.nextLine();
            boolean flag=false;
            for(int i=0;i<s.length();i++)
            {
                char cur=s.charAt(i);
                if(Character.isLetterOrDigit(cur))
                {
                    for(int j=0;j<i;j++)
                    {
                        if(s.charAt(j)==cur)
                        {
                            flag=true;
                        }
                    }
                }
                else
                {
                    flag=true;
                }
            }
            if(flag==true)
            {
                System.out.println("Invalid");
            }
            else
            {
                System.out.println("Valid");
                x=false;
            }
        }
    }

}
