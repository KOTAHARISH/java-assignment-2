
public class PalindromeNumber 
{
	public static void main(String[] args){
		char ch; 
		int k =0;
		int x = 121;
		String rev ="";
		String y =Integer.toString(x);
		
		for(int i = (y.length()-1);i>-1;i--){
			
			ch =y.charAt(i);
			
			rev = rev+ch;
			k = rev.length();
			
		}
		if (k==y.length()){
			
		
			if(y.equals(rev)){
				System.out.println("The given number is a palindrome number");
			} else{
				System.out.println("The given number is not a Palindrome number");	
			}
	    }
	}
}				