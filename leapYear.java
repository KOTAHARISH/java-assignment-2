
public class leapYear {

	public static void main(String[] args) 
	{
		int y = 2013;//given number
		
		// TODO Auto-generated method stub
		//logical and nor operator
		if ((y% 4==0)&&(y%100!=0)||(y%400==0)){
			System.out.println("The given year is a leap year");
		}
		else {
			System.out.println("The given year is not a leap year");
		}
	}

}
