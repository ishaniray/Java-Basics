import java.util.Scanner;
class CheckPrime
{
	public static void main(String args[])
	{
		int number, loop, flag=0;
		double sqroot;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = s.nextInt();
		sqroot = Math.sqrt(number);
		for(loop=2;loop<=sqroot;loop++)
		{
			if(number%loop==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(number+" is a prime number.");
		else
			System.out.println(number+" is not a prime number.");
	}
}
		