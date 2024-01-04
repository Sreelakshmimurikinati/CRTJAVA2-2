import java.util.*;
class Array1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a[],i;
		a=new int[5];
		System.out.println("Enter 5 elements");
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The values are");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}