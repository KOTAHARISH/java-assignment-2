
public class Gcdoftwonumbers {

	
	public static void main(String[] args) {
		int x =16;//first m=number
		int y = 24;//second number
		int gcd =1;
		int i = 1;
		for(i = 1;i<=x&&i<=y;i++){
		   if(x%i==0 && y%i==0){
			 gcd=i;  
		   }
		}
		System.out.println(gcd);
	}

}
