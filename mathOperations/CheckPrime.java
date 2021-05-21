//Testing Whether a Positive Integer is Prime
package mathOperations;

public class CheckPrime {
	public static void main(String args[]) {
		int num;
		
		//changeable value
		num=11;
		//changeable value end
		if(chPrime(num)) {
			System.out.println(num+" is a prime number");			
		}
		else {
			System.out.println(num+" is not a prime number");			
		}
	}
	
	//algo function
	private static boolean chPrime(int num) {
		if(num%2==0) {
			//if the number is even then it cannot be prime
			return false;
		}
		
		//iterating though numbers from 3 to sqrt of num jumping 2 each time and testing is num divisible
		for(int i=3; i<Math.sqrt(num); i+=2) {
			if(num%i==0) {
				//if the number is divisible then it means it is not prime
				return false;
			}
		}
		
		return true;
	}
}
