package fibonacciSequence;

import java.util.*;
public class fibonacciNumbers {

	private static long [] fibonacciTemp;
	public static void main(String[] args) {
		
		int num = 0;
		inputNumbers(num);

	}
	
	public static void inputNumbers(int num) {
		
		Scanner n = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		num = n.nextInt();
		fibonacci(num);
		fibonacciSequenceOutput(num);
		
		fibonacciTemp = new long [num + 1];
		
	}
	
	private static long fibonacci(int num) {
		if (num <= 1) {
			return num;
			
		}
		
		if (fibonacciTemp[num] != 0) {
			return fibonacciTemp[num];
		}
		
		long fibonacciNthTerm = (fibonacci(num - 1) + fibonacci (num -2));
		fibonacciTemp[num] = fibonacciNthTerm;
		
		return fibonacciNthTerm;
	}
	
	public static void fibonacciSequenceOutput(int num) {
		if (num == 0) {
			System.out.println("Invalid Input!");
		}
		
		else if (num == 1){
			System.out.println("The " + num + "st term in fibonacci sequence is " + fibonacci(num - 1) + ".");
		}
		
		else if (num == 2) {
			System.out.println("The " + num + "nd term in fibonacci sequence is " + fibonacci(num) + ".");
		}
		
		else if (num == 3) {
			System.out.println("The " + num + "rd term in fibonacci sequence is " + fibonacci(num) + ".");
		}
			
		else {
			System.out.println("The " + num + "th term in fibonacci sequence is " + fibonacci(num) + ".");
		}
		
	}

}
