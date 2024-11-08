package question1;

import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int arr[],Scanner sc) {
		System.out.print("Enter key to search Index:");
		int key=sc.nextInt();
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
		int arr[]= {16,12,27,34,22,12,31,27};
		int index=linearSearch(arr,sc);
		if(index==-1) {
			System.out.println("key doesn't exist");
		}else {
			System.out.println("last occurence of the key : "+index);
		}
	}
}
