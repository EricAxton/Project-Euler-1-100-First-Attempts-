
public class Euler5 {

	public static void main(String[] args) {
		System.out.println(euler5());

	}
	/*What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20
	 * Start at 400 (20*20 is the smallest candidate) then work up
	 * Use a while loop (while isDivisible is false, keep checking until it is true)
	 * Use a for loop to check if the number is divisible by the numbers from 2 to 20 (or an if statement???)
	 * Count the number of numbers 2<=x<=20 that are factors; if it is 19, it is divisible by all numbers under 20
	 * 
    */
	public static long euler5() {
		long i =400L;
		int factorCount = 0;
		boolean isDivisible = false;
		
		while(isDivisible == false) {
			for(int j = 1; j<21; j++) {
				if(i%j == 0) {
					factorCount++;
				}
			}
			System.out.println(i + " " + factorCount);
			if(factorCount == 20) {
				return(i);
			}
			
			i++;
			factorCount=0;
		}
		
		return(420L);
	}

}
