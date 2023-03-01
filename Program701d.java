class MyDate
{
	private int day;
	private int month;
	private int year;
	public int get_day()
	{
				return day;
	}
	public int get_month()
	{
				return month;
	}
    public int get_year()
	{
		return year;
	}//get_day
	public void set_day(int d)
	{
				day=d;
	}
	public void set_month(int m)
	{
				month=m;
	}
	public void set_year(int y)
	{
		year=y;
	}//set_day
}//mydate
class Test4
{
	public static void main(String[] args) 
	{
		MyDate obj=new MyDate();
		//obj.day=05;
		obj.set_day(22);
		obj.set_month(5);
		obj.set_year(2001);
		System.out.println(obj.get_day()+"-"+obj.get_month()+"-"+obj.get_year());
	}//main
}//test
