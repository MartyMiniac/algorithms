//Finding the Maximum of Three Numbers.
package mathOperations;

public class MaxNumber {
	public static void main(String args[]) {
		int num1, num2, num3;
		
		//can be changed----------------
		num1=5;
		num2=9;
		num3=10;
		//-----------------------------
		
		//logic starts
		int x=num1;
		if(num2>x) {
			x=num2;
		}
		if(num3>x) {
			x=num3;
		}
		
		//logic ends, output = x
		
		System.out.println("Max number = "+x);
	}
}
