import java.util.Scanner;

public class Calculator
{
	
	public int i ;
	public int j ;
	public char k ;
    
 
   public static void main (String []args)
   {
	 Calculator obj = new Calculator(); 
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter first numbers");
	 int i = sc.nextInt();
	 System.out.println("Enter second numbers");
	 int j = sc.nextInt();
	 System.out.println("Enter the operetaor (+ - * % )");
	 char k = sc.next().charAt(0);
	 
	 double o = 0 ;
	 
	 switch(k)
	  {
		 case '+': //addition
			 o = i + j ;
			 
	         break;
		 case '-' : //subtraction
			 o = i - j ;
			 break;
		 case '*' : //multiplication
			 o = i * j ;
			 break;
		 case '/' : //division
			 o = i / j ;
			 break;		 
		 default :
			 System.out.println("please enter valid numbers");
			 break;
	   }
	 
	  System.out.println("The final result:");
	  System.out.println( i+ " "+ k+ " "+j+ " " + "="+" " + o);
   }
  }