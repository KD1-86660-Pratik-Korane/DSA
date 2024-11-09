package question01;

import java.util.Arrays;

public class InsertionSortDesc {
	   public static void insertionSort(int arr[]) {
		   for(int i=1; i<arr.length; i++) {
			   int temp=arr[i];
			   int j;
			   for(j=i-1; j>=0 && arr[j]<temp; j--) {
				   arr[j+1]=arr[j];
			   }
			   arr[j+1]=temp;
		   }
	   }
       public static void main(String[] args) {
    	   int arr[] = {55, 44, 22, 66, 11, 33};
    	   insertionSort(arr);
    	   System.out.print("Array in desc order ->");
    	   System.out.println(Arrays.toString(arr));
	}
}
