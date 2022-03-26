package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;
		System.out.println("Factorial of a given number is");
		for (int i = 10; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("10*9*8*7*6*5*4*3*2*1 = " + factorial);
	}

}
