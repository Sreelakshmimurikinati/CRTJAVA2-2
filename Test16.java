import java.util.Scanner;
class Test 
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
		String s1;
		System.out.println("Entern a String");
		s1=s.next();
		int i;
		for(i=0;i<s1.length();i++)
		{
		    System.out.println(s1.charAt(i));
		}
	}
}