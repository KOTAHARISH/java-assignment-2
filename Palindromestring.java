
public class Palindromestring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char ch; 
		int k =0;
		String rev ="";
		String y = "madam"; // we have to input string value here
	   
	//for loop for getting reverse order
	   for(int i = (y.length()-1);i>-1;i--){
			
	        ch =y.charAt(i);
			
			rev = rev+ch;
			k = rev.length();
			
		}
	   if (k==y.length()){
			
		    //checking of both original and reverse strings
			if(y.equals(rev)){
				System.out.println("The given string is a palindrome String");
			} else{
				System.out.println("The given string is not a Palindrome String");	
			}
	   }
	}

}
