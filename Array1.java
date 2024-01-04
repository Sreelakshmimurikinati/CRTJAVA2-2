import java.util.*;
class  Array1
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[],i,n,big;
		System.out.println("Enter size of the array");
		n=s.nextInt();
		a=n.new int[n];
		System.out.println("Enter n element");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		big=a[0];
		for(i=1;i<n;i++)
		{
			if(big<a[i])
				big=a[i];
		}
		System.out.println("Biggest element="+big);
	}
}
