class Addition
{
    void add(int...a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
class Test
{
	public static void main(String[] args)
	{
		Addition a1=new Addition();
		a1.add(23,55);
		a1.add(34);
		a1.add(44,55,66,77,88,99,22,34,67,89,88);
		a1.add();
	}
}

