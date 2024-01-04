import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a[][],i,j,m,n,sum=0;
		System.out.println("Enter no of row and columns");
		m=s.nextInt();
		n=s.nextInt();
		a=new int[m][n];
		System.out.println("Enter elements");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				sum=sum+a[i][j];
			}
		}
		System.out.println("sum of elements="+sum);
	}
}