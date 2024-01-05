class First
{
    void show(float x,float y)
    {
        System.out.println("two arg float method");
    }
    void show(double d)
    {
        System.out.println("one arg double method");
    }
}
class Test
{
    public static void main(String[] args)
    {
        First f1=new First();
        f1.show(456);
        f1.show(34,78);
        f1.show(56,6f);
        //f1.show(55.6,76.8);
    }
}