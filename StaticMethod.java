class StaticMethod 
{
	static void myStaticMethod()
	{
		System.out.println("Static methods can be called without creating object");
	}//static
	public void myPublicMethod()
	{
		System.out.println("Public method must be called by creating object");
	}//public
	public static void main(String[] args) 
	{
		myStaticMethod();
		StaticMethod obj=new StaticMethod();
		obj.myPublicMethod();
	}//main
}//class
