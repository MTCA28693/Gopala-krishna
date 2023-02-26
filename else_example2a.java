import java.util.*;
class else_example2a
{
	public static void main(String[] args)
	{
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		i=sc.nextInt();
		j=sc.nextInt();
		k=sc.nextInt();
		//i=100;j=79;k=209;
		int min=0;
		if(i<j)
		{
			if(i<k)min=i;
			else min=k;
		}
		else
		{
			if(j<k)min=j;
			else min=k;
		}
		System.out.println("minimum of"+i+","+j+"and"+k+"is"+min);
	}
}