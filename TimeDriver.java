import java.util.Scanner;
class TimeDriver
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int hour, min, sec;
		System.out.println("Enter the hours, minutes and seconds of Time 1: ");
		hour = s.nextInt();
		min = s.nextInt();
		sec = s.nextInt();
		Time t1 = new Time(hour, min, sec);
		System.out.println("Enter the hours, minutes and seconds of Time 2: ");
		hour = s.nextInt();
		min = s.nextInt();
		sec = s.nextInt();
		Time t2 = new Time(hour, min, sec);
		t1.add(t2);
	}
}
