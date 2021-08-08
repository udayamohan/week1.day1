package week1.day1.assignment;

public class SumOfThreeDigits {
 // Using While
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 345;
		int quo,rem,sum = 0;
		while (n != 0) {
			quo = n/10;
			rem = n % 10;
			n = quo ;
			sum = sum+rem;
			
		}
		System.out.println("The Sum of three digits are: " +sum);
	}
}

		
				
				
