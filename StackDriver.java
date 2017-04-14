import java.util.Scanner;
class StackDriver
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int size, choice1, choice2, push;
		System.out.println("\nThis program can maintain two stacks and perform operations on them.");
		System.out.println("\nEnter capacity of Stack 1: ");
		size = scanner.nextInt();
		Stack stack1 = new Stack(size);
		System.out.println("\nEnter capacity of Stack 2: ");
		size = scanner.nextInt();
		Stack stack2 = new Stack(size);
		do
		{
			System.out.println("\n\t\tSTACK OPERATIONS:");
			System.out.println("----------------------------------------");
			System.out.println("1. PUSH          2. POP          3. EXIT");
			System.out.println("----------------------------------------");
			System.out.println("\nEnter your choice: ");
			choice1 = scanner.nextInt();
			switch(choice1)
			{
				case 1:	System.out.println("\nEnter the element to push:");
					push = scanner.nextInt();
					System.out.println("\nWhich stack to push the elements into? (Enter 1 or 2)");
					choice2 = scanner.nextInt();
					switch(choice2)
					{
						case 1:	stack1.push(push);
							System.out.println("\n" + push + " was successfully pushed into Stack 1.");
							break;

						case 2: stack2.push(push);
							System.out.println("\n" + push + " was successfully pushed into Stack 2.");
							break;
	
						default: System.out.println("\nInvalid choice!");
					}
					if(stack1.stacktop == stack2.stacktop)
						System.out.println("\nEach stack now has " + (stack1.stacktop + 1) + " element(s).");
					break;

				case 2:	System.out.println("\nWhich stack to pop from? (Enter 1 or 2)");
					choice2 = scanner.nextInt();
					switch(choice2)
					{
						case 1: stack1.pop();
							break;

						case 2: stack2.pop();
							break;

						default: System.out.println("\nInvalid choice!");
					}
					if(stack1.stacktop == stack2.stacktop)
						System.out.println("\nEach stack now has " + (stack1.stacktop + 1) + " element(s).");
					break;

				case 3: System.out.println("\nExiting program...");
					System.exit(0);

				default: System.out.println("\nInvalid choice!");
			} 
		} while(choice1 != 3);
	}
}

	