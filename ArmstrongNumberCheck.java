import java.util.Scanner;
class ArmstrongNumberCheck
{
	public static void main(String args[])
	{
		int number, copy, numofdigits=0, sumofpow=0, digit;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = s.nextInt();
		copy=number;
		while(copy>0)
		{
			copy/=10;
			numofdigits++;
		}
		copy=number;
		while(copy>0)
		{
			digit=copy%10;
			sumofpow+=Math.pow(digit,numofdigits);
			copy/=10;
		}
		if(sumofpow==number)
			System.out.println(number+" is an Armstrong number.");
		else
			System.out.println(number+" is not an Armstrong number.");
	}
}
		