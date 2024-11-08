package question5;

import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int arr[],Scanner sc,int key,int occ) {
		 int count=1;
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i]==key && count==occ) {
				  return i;
			 }else if(arr[i]==key){
				 count++;
			 }
		 }
		 return -1;
	}
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
		int arr[]= {16,12,27,34,22,12,31,27};
		System.out.print("Enter key to Search :");
		int key=sc.nextInt();
		System.out.print("Enter which occurence to find :");
		int occ=sc.nextInt();
		int index=linearSearch(arr,sc,key,occ);
		if(index==-1) {
			System.out.println("key doesn't exist");
		}else {
			System.out.println("occurence of the key : "+index);
		}
	}
}
