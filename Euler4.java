
public class Euler4 {

	public static void main(String[] args) {
		System.out.print(euler4());
	}
	/*Find the largest palindrome made from the product of two 
	3-digit numbers.
	*/
	public static int euler4() {
		/*
		 * Start from highest product of two 3 digit numbers (999*999=998,001) and loop through every number
		 * less than or equal to that and 10,000
		 * Check if the number is a palindrome (the first number that is a palindrome will be the largest
		 * palindrome)
		 * For 6 digit (hundred thousand) numbers:
		 * Set a string equal to the first 3 digits and set another string equal to the last three digits
		 * reversed
		 * If the strings .equal(), then that number is a palindrome
		 * If they don't, go to the next lowest number
		 * For 5 digit (ten thousand) numbers:
		 * Set a string equal to the first 2 digits and set another string equal to the last 2 digits (middle
		 * digit is mirror to itself)
		 * If the strings .equal(), then that number is a palindrome
		 * If they don't, go to the next lowest number
		 * Return the palindrome once it is found ONLY if it is a product of 2 3 digit numbers
		 * 
		 */
		
		int max = 998001;
		int min = 10000;
		
		
		for(int i = max; i>=min; i--) {
			if(i >=100000) {
				
				String first3 = (Integer.toString(i)).substring(0,3);
				String temp = (Integer.toString(i)).substring(3);
				String last3 = "";
				for(int j = 2; j >= 0; j--) {
					last3 += temp.substring(j,j+1);
				}
				
				if(first3.equals(last3)) {
					//TO DO: Code to test if i is a product of two 3 digit numbers
					//Check every 3 digit number to see if any are factors of i
					//if one is, check if (double) (f/i) is a 3 digit number that ends in 0.0
					for(int p = 999; p > 99; p--) {
						if(i%p == 0) {							for(int o = 100; o < 1000; o++) {
								if(p * o == i) {
									
									return(i);
								}
							}
						}
					}
					
				}
			}
		}
		/* (100 * 100 = 10000) <= solution <= (999 * 999 = 998001)
		 * Start at 998001 and work through all the numbers to 10000 (realized that the solution must be a 6 digit number)
		 * Use strings to check if the 1st 3 digits are the same as the last 3 digits reversed (is 123321 palindromic? yes, 123 = 123)
		 * Once a palindrome is found, it must be checked to see if it is a product of two 3-digit numbers
		 * Use for loop to find a 3-digit factor of i; use another for loop to find out if i / that factor is a 3 digit number
		 * If it is, then 3 digit * 3 digit = i, meaning i is the solution
		 * 906609 is the solution
		 */
		
		return(420);
	}

}
