package newMethod;

public class newMethodPractice {

	public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
		String name = "Kaeyls";
		int age = 18;
		
		welcome(name, age); // Arguments

		int x = 5;
		int y = 10;
		
		
		System.out.println("The sum of " + x + " and " + y + " is " + (add (x,y)) + ".");
		
	} // Arguments and Parameters should be the same
	
	public static void welcome(String name, int age) { // Parameter{
		System.out.println("Hello " + name +"!");
		System.out.println("You are " + age + " years old.");
		
	}
	
	public static int add(int x, int y) {
		
		return x + y; 
	}

}
