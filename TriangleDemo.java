
 class Triangle
{
	double base;
	double height;
	//double depth;
}
class TriangleDemo
{
	public static void main(String[] args) 
	{
		Triangle mytriangle=new Triangle();
		double area;
		mytriangle.base=100;
		mytriangle.height=200;
		//mybox.depth=150;
		area=1.0/2*mytriangle.base*mytriangle.height;
		System.out.println( "area is:"+area);
	}
}
