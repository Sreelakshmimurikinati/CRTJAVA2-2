class First
{
    int a=100;
    void show()
    {
        System.out.println("super demo");
    }
}
class Second extends First
{
    int a=256;
    void show(int a)
    {
        Super.show();
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Super.a);
    }
}
class Single
{
    public static void main(String[] args)
    {
        Second s1=new Second();
        s1.show(888);
    }
}
