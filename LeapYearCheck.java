import java.util.Scanner;
class LeapYearCheck
{
	public static void main(String args[])
	{
		int year;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter year:");
		year = s.nextInt();
		if(year%100==0)
		{
			if(year%400==0)
				System.out.println(year+" is a leap year.");
			else
				System.out.println(year+" is not a leap year.");
		}
		else
		{
			if(year%4==0)
				System.out.println(year+" is a leap year.");
			else
				System.out.println(year+" is not a leap year.");
		}
	}
}