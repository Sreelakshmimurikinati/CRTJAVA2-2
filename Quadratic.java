import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		double a,b,c;
		System.out.println("enter the values of a,b,c");
		a=s.nextDouble();
		b=s.nextDouble();
		c=s.nextDouble();
		double r1,r2,d;
		d=b*b-4*a*c;
		if(d>0)
		{
			System.out.println("roots are not possible");
		}
		else
		{
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("roots1="+r1);
			System.out.println("roots2="+r2);
		}
	}
}
