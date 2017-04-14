import java.util.Scanner;
class StarPattern
{
	public static void main(String args[])
	{
		int numofrows, loop, rowcount=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		numofrows = s.nextInt();
		while(rowcount<=numofrows)
		{
			loop=0;
			while(loop!=rowcount)
			{
				System.out.print("* ");
				loop++;
			}
			System.out.println();
			rowcount++;
		}
	}
}