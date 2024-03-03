package javaProject;

import java.util.*;
public class javaRandomProjects {

	public static void main(String[] args) {
		
		inputNumber();
		
	}
	
	public static void inputNumber() {
		
		Scanner n = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		int num = n.nextInt();
		countBackwards(num);
		
	}
	
	public static void countBackwards(int num) {
		if (num == 0) {
			System.out.println("Done!");
			
		}
		
		else {
			System.out.println(num);
			num--;
			countBackwards(num);
		}
		
	}

}
