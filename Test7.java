class First
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
class Second extends First
{
    void add(int a,int b,int c,int d)
    {
        System.out.println(a+b+c+d);
    }
}
class Test
{
    public static void main(String[] args)
    {
        Second f1=new Second();
        f1.add(22,55);
        f1.add(66,23,88);
        f1.add(76,22,67,44);
    }
}