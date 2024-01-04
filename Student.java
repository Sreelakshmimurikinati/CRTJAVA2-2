class Student
{
	int admno;
	String name;
	void get(int x,String y)
	{
		admno=x;
		name=y;
	}
	void show()
	{
		System.out.println("Admission no="+admno+"Name="+name);
		}
	}
	class Test
	{
		public static void main(String[] args)
		{
			Student s1=new Student();
			s1.get(111,"rrr");
			s1.show();
			Student s2=new Student();
			s2.get(222,"kkk");
			s2.show();
		}
	}




	
