/*
 * By considering the terms in the Fibonacci sequence whose values do not 
 * exceed four million, find the sum of the even-valued terms.
 */


public class P2EvenFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 2;
		int z = 0;
		int sum = 2; 
		while ( x < 4000000 ) {
			z = x + y;
			if ( z % 2 == 0 ) {
				sum += z;
			}
			x = y;
			y = z;
			
		}
		System.out.println(sum);

	}
}
