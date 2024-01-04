import java.util.*;
class Array1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a[][],i,j,m,n;
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
		System.out.println("Matrix is");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print();
		}
		System.out.println("Transpose matrix is");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}