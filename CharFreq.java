import java.util.*;
class CharFreq
{
	public static void main(String[] args)
	{
		int uc = 0, lc = 0, dig = 0, sp = 0;
		char[] str = new char[args[0].length()];
		str = args[0].toCharArray();
		int index;
		for(index = 0; index < args[0].length(); ++index)
		{
			if(str[index] > 64 && str[index] < 91)
				uc++;
			if(str[index] > 96 && str[index] < 123)
				lc++;
			if(str[index] > 47 && str[index] < 58)
				dig++;
			if(str[index] == ' ')
				sp++;
		}
		System.out.println("Number of upper case characters: " + uc);
		System.out.println("Number of lower case characters: " + lc);
		System.out.println("Number of digits: " + dig);
		System.out.println("Number of spaces: " + sp);
	}
}