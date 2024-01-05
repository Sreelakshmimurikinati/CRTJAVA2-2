class Data
{
    int a,b;
    void get(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void show()
    {
        System.out.println("a="+a+"b="+b);
    }
}
class Addition extends Data
{
    void total()
    {
        System.out.println("Addition="+(a+b));
    }
}
class Multiply extends  Data
{
    void product()
    {
        System.out.println("Product="+(a*b));
    }
}
class Single
{
    public static void main(String[] args)
    {
        Addition a1=new Addition();
        a1.get(100,223);
        a1.show();
        a1.total();
        Multiply m1=new Multiply();
        m1.get(22,75);
        m1.show();
        m1.product();
    }
}