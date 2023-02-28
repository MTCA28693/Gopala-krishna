class Student 
{
	int rollno;
	String name;
	static String college="MTI";
	static void change()
	{
		college="MTCA";
	}
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
	public class TestMethod
	{
	public static void main(String[] args) 
	{
		Student.change();
		Student s1=new Student(12,"Gopal");
		Student s2=new Student(13,"Gopichand");
		Student s3=new Student(15,"Guna");
		Student s4=new Student(1,"Ajay");
		//Student.college="MTI";
		s1.display();
		s2.display();
		s3.display();
        s4.display();
	}
	}