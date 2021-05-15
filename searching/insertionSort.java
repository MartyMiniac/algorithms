package searching;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]) {
        int arr[] = arrayPooper(5, 5);

        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length-1; i++) {
            // System.out.println("----------------------");
            // System.out.println("Chance for "+arr[i+1]);
            for(int j=i+1; j>0; j--) {
                if(arr[j]<arr[j-1]) {
                    arr=swap(arr, j, j-1);
                    // System.out.print("Swap ");
                }
                // System.out.println(Arrays.toString(arr));
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static int[] swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }

    private static int[] arrayPooper(int size, int range) {
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i]=(int)((Math.random()*range*2)-range);
        }
        return arr;
    }
}