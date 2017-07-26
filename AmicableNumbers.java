import java.util.Scanner;
import java.util.ArrayList;

public class AmicableNumbers 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("This program finds pairs of amicable numbers in the range 2 to n.");
		System.out.println("(Amicable numbers are two different numbers so related that the sum of the proper divisors of each is equal to the other number.)");
		do
		{
			System.out.print("\nEnter n (>= 3) : ");
			n = scanner.nextInt();
		} while(n < 3);
		
		int i, j, sum, k;
		/* Since it is not known how many pairs of numbers would be generated, two lists are declared instead of two arrays of random size */
		ArrayList<Integer> me = new ArrayList<Integer>();	/* Holds the first object of a particular pair */
		ArrayList<Integer> my_friend = new ArrayList<Integer>(); /* Holds the second object of a particular pair */
		
		for(i = 2; i <= n; ++i)
		{
			sum = 0;
			for(j = 1; j <= (i / 2); ++j)
			{
				if(i % j == 0)
					sum += j;	/* Adding proper factors of i */
			}
			
			if(sum == i)	/* Check to exclude perfect numbers */
				continue;
			
			k = sum;	/* Assigning the sum of proper divisors of i to k */
			sum = 0;	/* Re-initializing sum to 0 */
			
			/* Reverse calculation */
			for(j = 1; j <= (k / 2); ++j)
			{
				if(k % j == 0)
					sum += j;
			}
			
			if(sum == i) /* Pair of amicable numbers found */
			{
				me.add(i);
				my_friend.add(k);
			}
		}
		
		/* Converting the lists into arrays for convenient index-based comparison */
		Integer[] a = new Integer[me.size()];
		a = me.toArray(a);
		Integer[] b = new Integer[me.size()];
		b = my_friend.toArray(b);
		
		if(a.length == 0)
		{
			System.out.println("\nNo pair of amicable numbers was found in the range 2 to " + n + ".");
			System.exit(0);
		}
		
		System.out.println("\nThe pairs of amicable numbers between 2 and " + n + " are: ");
		
		/* Printing results */
		boolean flag;
		for(i = 0; i < a.length; ++i)
		{
			flag = false;
			/* Checking for duplicates */
			for(j = 0; j < i; ++j)
			{
				if((int)b[j] == (int)a[i])	
					flag = true;	/* Current pair has already been printed */
			}
			
			if(flag == false)
				System.out.println(a[i] + ", " + b[i]);
		}

	}
}