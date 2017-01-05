import java.util.Scanner;
class ChefAndKeyboard1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=in.nextInt();
			int m=in.nextInt();
			int c=in.nextInt();
			int ans=0;
			for(int j=1;j<=n;j++)
			{
				for(int k=1;k<=m;k++)
				{
					if(j*k==c)
					{
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}