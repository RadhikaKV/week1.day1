package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//number which is divisible only by 1 and itself
		// 2,3,5,7,11,13,17
		
		int input = 17;
		boolean val = true;
		int primeValue;
		for (int i =2; i <=13; i++) {
			primeValue = input % 2;
			if (primeValue == 0) {
				System.out.println(input + " is not a prime number");
				break;
			}
		}
		if (val)
			System.out.println(input + " is a prime number");
	}

}
