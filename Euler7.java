public class Euler7 {

	public static void main(String[] args) {
		
		System.out.println(euler7());
		
		System.out.println(isPrime(104743));
	}
	
	public static long euler7() {
		int primeCount = 0;
		int check = 1;
		
		while(primeCount != 10001) {
			if(isPrime(check)) {
				primeCount++;
			}
			
			check++;
		}
		
		return(check-1);
	}
		/* If the number is 1, 0, or negative, it can't be prime
		 * If the number is 2 or 3, it is prime
		 * If the number is divisible by 2 or 3, it is not prime
		 * All integers can be represented by 6k +/- i where k and i are -1, 0, 1, 2 , 3, 
		 * 
		 */
	public static boolean isPrime(long input) {
		if(input <= 1) {
			return(false);
		}
		
		if(input == 2 || input == 3) {
			return(true);
		}
		
		if(input%2 == 0 || input%3 == 0) {
			return(false);
		}
		
		for(int i = 5; i <=Math.sqrt((double)input); i+=6) {
			if(input % i == 0 || input % (i + 2) == 0) {
				return(false);
			}
			
		}
		
		return(true);
		
	}

}
