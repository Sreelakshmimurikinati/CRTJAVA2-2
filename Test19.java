import java.util.*;
class Test
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    String s1="java";
	    String s2="python";
	    String s3="java";
	    String s4="Java";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
	}
}
