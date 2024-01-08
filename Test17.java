import java.util.Scanner;
class Test 
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
		String s1;
		System.out.println("Entern a String");
		s1=s.next();
		char ch[]=s1.toCharArray();
		int i;
		for(i=0;i<ch.length;i++)
		{
		    System.out.println(ch[i]);
		}
	}
}