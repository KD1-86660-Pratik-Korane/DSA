package question2;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int arr[],int start,int end,int key,int count) {
		if(start > end)
			return -1;
		int mid = (start + end) / 2; 
		if(key == arr[mid]) {
			System.out.println("No of comparisons done : "+count);
			return mid;
		}
		else if(key < arr[mid]) {
			count++;
			return binarySearch(arr, start, mid - 1,key,count);
		}
		else 	 {
			count++;
			return binarySearch(arr, mid + 1, end,key,count);
		}
		 
	}
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
		int arr[]= {16,19,23,34,47,67,88};
		System.out.print("Enter key to search :");
		int key=sc.nextInt();
		int count=0;
		int index=binarySearch(arr,0,arr.length-1,key,count);
		if(index==-1) {
			System.out.println("key doesn't exist");
		}else {
			System.out.println("Key found at Index : "+index);
		}
	}
}
