class Animal2a
{
	Animal2a(){
		System.out.println("Animal2a is created");
	}
}
	class Dog extends Animal2a
	{
		Dog()
		{
			//super();
			System.out.println("Dog is created");
			}
	}
	class TestSuper3
	{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
	}
}
