public class Main
{
    int admno;
    String name;
    Main(int admno,String name)
    {
		this.admno=admno;
        this.name=name;
    }
    void show()
    {
        System.out.println("Admno="+admno+"Name="+name);
    }
    public static void main(String[] args)
    {
        Main s1=new Main();
		s1.get(222,"rrr");
        s1.show();
		Main s2=new Main();
		s2.get(666,"kkk");
		s2.show();
    }
}