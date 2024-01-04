public class Main
{
    void m1()
    {
        System.out.println("Instance method");
    }
    static void m2()
    {
        System.out.println("Static method");
    }
	public static void main(String[] args)
	{
	    //Main.m1();
	    Main.m2();
	    Main s1=new Main();
	    s1.m1();
	    s1.m2();
	}
}