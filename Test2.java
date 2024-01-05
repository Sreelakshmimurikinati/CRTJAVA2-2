class Student
{
    int admno;
    String name;
    void get(int admno,String name)
    {
        this.admno=admno;
        this.name=name;
    }
    void show()
    {
        System.out.println("Admission no="+admno);
        System.out.println("Name="+name);
    }
}
class Marks extends Student
{
    int mat,phy,che;
    void getMarks(int mat,int phy,int che)
    {
        this.mat=mat;
        this.phy=phy;
        this.che=che;
    }
    void showMarks()
    {
        System.out.println("maths="+mat);
        System.out.println("physics="+phy);
        System.out.println("chemistry="+che);
    }
}
class Result extends Marks
{
    void showResult()
    {
        System.out.println("Total="+(mat+phy+che));
        System.out.println("Average="+(mat+phy+che)/3);
    }
}
class Single
{
    public static void main(String[] args)
    {
        Result r1=new Result();
        r1.get(111,"rrr");
        r1.getMarks(88,56,68);
        r1.show();
        r1.showMarks();
        r1.showResult();
    }
}