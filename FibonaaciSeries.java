package week1.day1;

public class FibonaaciSeries {

	public static void main(String[] args) {
		int range = 8;
		int firstNumber = 0;
		int secondNumber = 1;
		int sum;
		
		System.out.println("First number is : "+firstNumber);
		for (int i =1; i <=range; i++) {
			sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
			
			System.out.println(+sum);
		}
	}

}
