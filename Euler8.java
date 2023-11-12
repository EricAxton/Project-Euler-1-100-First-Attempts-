import java.util.Arrays;
public class Euler8 {

	//Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
	
	public static void main(String[] args) {
		String bigNumber = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		
		System.out.println(bigNumber.length());
		//1000 digit number as an array
		int[] bigNum = turnIntoArray(bigNumber,1000);
		
		System.out.println(largestThirteenProduct(bigNum));
	}
	
	//Turn the number into an array
	public static int[] turnIntoArray(String number, int length) {
		int[] numArray = new int[length];
		
		for(int i = 0; i < length; i++) {
			numArray[i] = Integer.valueOf(number.substring(i,i+1));
		}
		
		return(numArray);
	}
	
	/* need int max 
	 * 
	 * Need for loop (int i = 0; i < bigNum.length - 12; i++)
	 * for loop to multiply i,i+1,i+2...i+12 to find the product of the 13 digits, which is assigned to currentProduct
	 * if currentProduct > max, max = currentProduct
	 * repeats for every group of adjacent 13 digits in the number
	 */
	
	//iterates through all indexes in the array
	//iterates through all the indexes in each of the 13 adjacent digits
	//the new max becomes the current product of the current 13 digit number if the current product is greater than the current max product
	public static long largestThirteenProduct(int[] longNumber) {
		long currentProduct = 1;
		long maxProduct = 1;
		
		for(int i = 0; i < longNumber.length - 13; i++) {
			currentProduct = 1;
			
			for(int j = i; j < i + 13; j++) {
				currentProduct*=longNumber[j];
				System.out.println(j + ": " + longNumber[j]);
				System.out.println(currentProduct);
			}
			
			if(currentProduct > maxProduct) {
				maxProduct = currentProduct;
			}
		}
		
		
		return(maxProduct);
	}

}
