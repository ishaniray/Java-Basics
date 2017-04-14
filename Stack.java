class Stack
{
	int size, stacktop;
	int[] elements;
	
	Stack(int size)
	{
		this.size = size;
		stacktop = -1;
		elements = new int[size];
	}

	void push(int item)
	{
		if(stacktop < size - 1)
			elements[++stacktop] = item;
		else
			System.out.println("\nOverflow!");
	}

	void pop()
	{
		if(stacktop == -1)
			System.out.println("\nUnderflow!");
		else
			System.out.println("\nThe popped element is " + elements[stacktop--] + ".");
	}
}