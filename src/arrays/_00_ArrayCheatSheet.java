package arrays;

import java.util.Iterator;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {

		//1. make an array of 5 Strings
		String[] arr = new String[]{"Hi", "Hello", "Hey", "Hola", "Howdy"};
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "Salutations";
		//4. print the third element again
		System.out.println(arr[2] + "\n");
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		//6. make an array of 50 integers
		int[] array = new int[50];
 		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for ( int i = 0; i < array.length; i++ ) {
			array[i] = r.nextInt(1000);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = array[0];
		
		for ( int i = 1; i < array.length; i++ ) {
			if (array[i] < smallest ) {
				smallest = array[i];
			}
		}
		System.out.println(smallest + "\n");
		
		//10. print the largest number in the array.
		int largest = array[0];
		
		for ( int i : array ) {
			if ( i > largest) {
				largest = i;
			}
		}
		System.out.println(largest + "\n");
		
		//9 print the entire array to see if step 8 was correct
		for ( int i : array ) {
			System.out.println(i);
		}

	}
}
