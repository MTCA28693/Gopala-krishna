import java.util.*;
class if_example1
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
		int min;
		min=0;
		if(i<j&&i<k)min=i;
		{
			if(j<i&&j<k)min=j;
			if(k<i&&k<j)min=k;
		}
		System.out.println("minimum of"+i+","+j+"and"+k+"is"+min);
	}
}