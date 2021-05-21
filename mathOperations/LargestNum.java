package mathOperations;

public class LargestNum {
	public static void main(String args[]) {
		//changeable values
		int[] arr={1,3,2,6,5,10,8,9};
		//changeable values end;
		
		System.out.println("Largest number = "+findMax(arr));
	}
	
	private static int findMax(int[] arr) {
		//considering first number as largest
		int max=arr[0];
		
		//iterating though all of the number is the array
		for(int i=1; i<arr.length; i++) {
			//if the given number is greater than the considered max set max equal to given number
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
}
