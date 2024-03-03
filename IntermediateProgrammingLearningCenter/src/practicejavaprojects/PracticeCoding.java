package practicejavaprojects;
import java.util.*;

public class PracticeCoding {

	public static void main(String[] args) {
		
		int size, element, find;
		
		Scanner n = new Scanner (System.in);
		
		// Input of size & array elements
		System.out.print("Enter size: ");
		size = n.nextInt();
		
		int [] array = new int [size];
		
		for (int i = 0; i < size; i++) {
			System.out.print("Enter element: ");
			array[i] = n.nextInt();
			
		}
		
		System.out.println("Array Elements: " + Arrays.toString(array) + "\n");
		
// ----------------------------------------------------------------------------------------------------------------------------------------------------
		
		// Find the index of an element
		System.out.print("Find: ");
		find = n.nextInt();
		
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (find == array[i]) {
				index = i;
				System.out.println(find + " is at index " + index + "\n");
				
			}
				
		}
		
// ----------------------------------------------------------------------------------------------------------------------------------------------------
		
		// Sorting array into ascending order
		Arrays.sort(array);
		System.out.println("Sorted Array: " + Arrays.toString(array));
		
// ----------------------------------------------------------------------------------------------------------------------------------------------------
		
		// Check how many even and odd numbers are inside the array
		int evenNumbers = 0;
		int oddNumbers = 0;
		
		for(int i = 0; i < size; i++) {
			if(array[i] % 2 == 0) {
				evenNumbers++;
				
			}
			
		}
		System.out.println("There are " + evenNumbers + " even numbers in the array.");
		
		for (int i = 0; i < size; i++) {
			if (array[i] % 2 != 0) {
				oddNumbers++;
				
			}
		
		}
		System.out.println("There are " + oddNumbers + " odd numbers in the array.");
	}
	

}
