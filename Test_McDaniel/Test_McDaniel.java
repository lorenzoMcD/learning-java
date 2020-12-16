import java.util.Scanner;



public class Test_McDaniel {

	

	public static void main(String[] args) {
		

		// need to take in input from user 
		
		Scanner input = new Scanner(System.in);
		
		// prompt 
		
		System.out.print("Enter list: ");
		
		// get first number to set the array size 
		int size = input.nextInt();
		
		// create array based off size 
		
		int[] list = new int[size];
		
		
		// now add values to size 
		
		// create for loop that will add values to the array 
		
		for(int i = 0; i < list.length; i++)
		{
			
			list[i] = input.nextInt();
			
		}
		
		
		// send the array to the method to test if it is sorted 
		
		boolean answer = isSorted(list);
		
		
		// print out the if list is sorted or not sorted
		if ( answer == true)
		{
			System.out.println("The list is already sorted");
		}
		else
		{
			System.out.println("The list is not sorted");
			
		}
		
		
		
		
	}

	

public static boolean isSorted(int[] list)
{	
	boolean answer = true;
	// set the first index in list to max number
	// if the array is sorted then the first number (list[0]) will 
	// never be higher then the next number in array 
	
	int num = list[0];
	
	for(int i = 1; i < list.length; i++)
	{
		
		if( num > list[i] )
		{
			answer = false;
			
		}
		
	}
	
	return answer;
}
	
	
	
	
}
