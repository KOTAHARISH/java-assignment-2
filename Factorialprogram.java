
public class Factorialprogram {
	static int i = 0;
	static int factorial (int x){
		if (x==0){
			return 1;
		}
		else{
			 return(x * factorial(x-1));  	
		}
    	
    }
	
	public static void main(String[] args) {
		int x = 4;//input number
		int fact, fact1 = 1;
		fact = factorial(x);
		System.out.println("the factorial of "+x+"  by recursion is "+fact);
		
		
		//loop for factorial
		for (i=1;i<=x;i++){
			fact1= fact *i;
		}
		System.out.println("the factorial of "+x+"  by loop is "+fact);
	}

}

