import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a[][],i,j,n,sum=0;
		System.out.println("Enter size of array");
		n=s.nextInt();
		a=new int[n][n];
		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			    if(i==j)
				sum=sum+a[i][j];
			}
		}
		System.out.println("sum of diagonal elements="+sum);
	}
}