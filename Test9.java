class First
{
    void show(double...a)
    {
        System.out.println("var arg  method");
    }
    void show(double x,double y)
    {
        System.out.println("two arg double method");
    }
}
class Test
{
    public static void main(String[] args)
    {
        First f1=new First();
        f1.show(23.5,67.88);
        f1.show();
        f1.show(34,66,88,99,77,23,56);
    }
}