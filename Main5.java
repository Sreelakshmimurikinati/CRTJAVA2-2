public class Main
{
    int admno;
    String name;
    Main(int x,String y)
    {
        admno=x;
        name=y;
    }
    void show()
    {
        System.out.println("Admno="+admno+"Name="+name);
    }
    public static void main(String[] args)
    {
        Main s=new Main(222,"rrr");
        s.show();
    }
}