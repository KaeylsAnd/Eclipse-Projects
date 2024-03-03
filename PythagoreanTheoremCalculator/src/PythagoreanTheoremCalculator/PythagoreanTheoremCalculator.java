package PythagoreanTheoremCalculator;

import java.util.Scanner;
public class PythagoreanTheoremCalculator {

	public static void main(String[] args) {

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		Scanner n = new Scanner (System.in); // n = scanner for input
        
		// Variable Declaration || ad = a, op = b, hy = c
        double ad, adRound, op = 0, opRound, hy = 0, hyRound;
        char choice;
      
        // Ask user for input
        System.out.println("A. Adjacent" + "\n" + "B. Opposite" + "\n" + "C. Hypotenuse");
                
        System.out.print("Enter the side of triangle needed." + "\n" + "Letter only. (A,B,C): ");
        choice = n.next().charAt(0);
        
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        if (choice == 'A' || choice == 'a'){
            
            System.out.print("Enter the value of Opposite Side: ");
            op = n.nextInt();
            
            System.out.print("Enter the value of Hypotenuse Side: " );
            hy = n.nextInt();
            
            if (op >= hy){
            
                System.out.println("Invalid Input. Hypotenuse side should be greater than the Opposite side.");
            
            }else if (op <= 0 || hy <= 0){
            
                System.out.println("Invalid Input. The Hypotenuse or Opposite side of the triangle should be a positive integer");
            
            }else{
            
                ad = Math.sqrt ((hy * hy) - (op * op));
            
                adRound = Math.round(ad * 100.0) / 100.0;
                System.out.println("The adjacent side of the triangle is " + ad + " or " + adRound);
            }
            
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------
            
        }else if (choice == 'B' || choice == 'b') {
        	
        	System.out.print("Enter the value of Adjacent Side: ");
            ad = n.nextInt();
            
            System.out.print("Enter the value of Hypotenuse Side: " );
            hy = n.nextInt();
        	
            if (ad >= hy) {
            	
            	System.out.println("Invalid Input. Hypotenuse side should be greater than the Adjacent side");
            	
            }else if (ad <= 0 || hy <= 0) {
            	
            	System.out.println("Invalid Input. The Hypotenuse or Adjacent side of the triangle should be a positive integer");
            	
            }else {
            	
            	op = Math.sqrt ((hy * hy) - (ad * ad));
                
                opRound = Math.round(op * 100.0) / 100.0;
                System.out.println("The opposite side of the triangle is " + op + " or " + opRound);
            }
        
//---------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        }else if (choice == 'C' || choice == 'c') {
    	
        	System.out.print("Enter the value of Adjacent Side: ");
        	ad = n.nextInt();
        
        	System.out.print("Enter the value of Opposite Side: " );
        	op = n.nextInt();
    	
        		if (ad <= 0 || op <= 0) {
        			
        			System.out.println("Invalid Input. The Adjacent or Opposite side of the triangle should be a positive integer");
        	
                	
                }else {
                	
                	hy = Math.sqrt ((ad * ad) + (op * op));
                    
        			hyRound = Math.round(hy * 100.0) / 100.0;
        			System.out.println("The hypotenuse side of the triangle is " + hy + " or " + hyRound);
                }
        		
//---------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        }else{
        	
            System.out.println("Invalid Input. Please choose between the letter A, B, and C.");
            
        }
        
    }

}
