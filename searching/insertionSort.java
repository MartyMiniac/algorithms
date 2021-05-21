package searching;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]) {
        //populate arr[] with some random numbers
    	int arr[] = arrayPooper(5, 5);
    	
    	//initial array display
        System.out.println(Arrays.toString(arr));

        //consider array below i-1 is sorted
        //we are taking each element from the array and comparing to the sorted array
        //where the comparison becomes false just before that element the key is added and rest are shift to make space for the key.
        for(int j=1; j<arr.length; j++) {
        	int key=arr[j];
        	int i=j-1;
        	while(i>=0 && arr[i]>key) {
        		//shift operation for the key's possible place
        		arr[i+1]=arr[i];
        		i--;
        	}
        	arr[i+1]=key;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static int[] arrayPooper(int size, int range) {
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i]=(int)((Math.random()*range*2)-range);
        }
        return arr;
    }
}