import java.util.Scanner;
class ArrayMergeSort
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		System.out.println("\nEnter size of the first array:");
		int size1 = s.nextInt();
		System.out.println("\nEnter size of the second array:");
		int size2 = s.nextInt();

		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		int arr3[] = new int[size1+size2];

		int i, j = 0, k = 0;

		System.out.println("\nEnter elements of the first array:");
		for(i=0; i<size1; i++)
		 arr1[i] = s.nextInt();


		System.out.println("\nEnter elements of the second array:");
		for(i=0; i<size2; i++)
		 arr2[i] = s.nextInt();

		i = 0;

		while(i<size1 && j<size2)
		{
			if(arr1[i] < arr2[j])
			{
				arr3[k] = arr1[i];
				i++;
				k++;
				continue;
			}
			if(arr2[j] < arr1[i])
			{
				arr3[k] = arr2[j];
				j++;
				k++;
				continue;
			}
			if(arr1[i] == arr2[j])
			{
				arr3[k] = arr1[i];
				arr3[k+1] = arr1[i];
				i++; j++; k = k + 2;
			}
		}
		
		if(i==size1)
		{
			while(j < size2)
			{
				arr3[k] = arr2[j];
				j++; k++;
			}
		}

		else
		{
			while(i < size1)
			{
				arr3[k] = arr1[i];
				i++; k++;
			}
		}

		System.out.println("The merged and sorted array is:");
		for(i=0; i<(size1+size2); i++)
			System.out.print(arr3[i]+" ");
	}
}
				
