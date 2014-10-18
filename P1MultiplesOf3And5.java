/*
 * This class determines the sum of all the multiples of 3 or 5 below 1000
 */
public class P1MultiplesOf3And5 {
	
	public static int MultiplesOf(int number) {
		int sum = 0;
		for (int i = 0; i < number; i++) {
			if ( i % 3 == 0 || i % 5 == 0 ) {
				System.out.print(i+ " ");
				sum += i;
			}
		}
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String [] args) {
		int sumOfMults = MultiplesOf(1000);
		System.out.println(sumOfMults);
	}

}
