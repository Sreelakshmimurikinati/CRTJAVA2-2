class FirstYear
{
    void branch()
    {
        System.out.println("CSE");
    }
    void subjects()
    {
        System.out.println("C PYTHON MATHS PHY");
    }
    void backlogs()
    {
        System.out.println("PHY");
    }
}
class SecondYear 
{
    void subjects()
    {
        FirstYear f1=new FirstYear();
        f1.branch();
        f1.backlogs();
        System.out.println("JAVA DS DBMS");
    }
}
class Test
{
    public static void main(String[] args)
    {
		SecondYear s1=new SecondYear();
		s1.subjects();
    }
}