import java.util.*;
class StringReversal
{
	public static void main(String[] args)
	{
		char[] reverse = new char[args[0].length()];
		reverse = args[0].toCharArray();
		int index1, index2;
		char temp;
		for(index1 = 0, index2 = args[0].length() - 1; index1 < index2; ++index1, --index2)
		{
			temp = reverse[index1];
			reverse[index1] = reverse[index2];
			reverse[index2] = temp;
		}
		String rev = new String(reverse);
		System.out.println(rev);
	}
}	