public class Euler6 {

	public static void main(String[] args) {
	
	System.out.println(euler6());
	}
//	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	public static long euler6() {
		long sumOfSquares = 0L;
		long squareOfSum = 0L;
		
		for(long i = 1; i < 101; i++) {
			sumOfSquares+=i*i;
			System.out.println(sumOfSquares);
		}
		
		for(long i = 1; i < 101; i++) {
			squareOfSum+=i;
			System.out.println(squareOfSum);
		}
		
		squareOfSum*=squareOfSum;
		
		return(sumOfSquares - squareOfSum);
	}

}
