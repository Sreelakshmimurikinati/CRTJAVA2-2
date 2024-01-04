import java.util.*;
class div
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,b,r;
		System.out.println("enter two numbers");
		a=s.nextInt();
		b=s.nextInt();
		if(b==0)
		{
			System.out.println("second no cannot be zero");
			b=1;
		}
		r=a/b;
		System.out.println("division="+r);
	}
}
