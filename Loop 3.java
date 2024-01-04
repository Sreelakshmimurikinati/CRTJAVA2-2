import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int i,n,r=0;
	    n=s.nextInt();
	    for(i=1;i<=n;i++)
	    {
	        r=r+i;
	    }
		System.out.println(r);
	}
}