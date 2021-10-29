import java.util.Scanner;


public class gretestOfThree 
{
   public static void main(String [] args)
   {	
	    
	    Scanner values = new Scanner(System.in);
	    System.out.println("Please enter first number");
		int num1 = values.nextInt();
	    
	    Scanner values1 = new Scanner(System.in);
	    System.out.println("Please enter second number");
		int num2 = values1.nextInt();
	    
	    Scanner values2 = new Scanner(System.in);
	    System.out.println("Please enter third number");
		int num3 = values2.nextInt();
		
		if((num1>num2) &&(num1>num3)){
			System.out.println("First number is greatest");
		}
		else if((num2>num1) &&(num2>num3)){
			System.out.println("Second number is greatest");
		}
		else{
			System.out.println("Third number is greatest");
		}
		
   }
  
}
