package mathOperations;

public class Factorial {
	public static void main(String args[]) {
		int num;

		//changeable values
		num=5;
		//changeable values end
		
		System.out.println(num+"! = "+findFactorial(num));
	}
	
	private static int findFactorial(int num) {
		int ans=1;
		
		//multiply all the numbers from 2 to num to ans
		for(int i=2; i<(num+1); i++) {
			ans*=i;
		}
		
		return ans;
	}
}
