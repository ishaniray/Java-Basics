import java.util.Scanner;
class PalindromeNumberCheck
{
	public static void main(String args[])
	{
		int number, copy, reverse=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = s.nextInt();
		copy = number;
		while(copy>10)
		{
			reverse+=copy%10;
			reverse*=10;
		}
		reverse+=copy;
		if(reverse==number)
			System.out.println(number+" is a palindrome.");
		else
			System.out.println(number+" is not a palindrome.");
	}
}
		