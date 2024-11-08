package question07;

import java.util.Scanner;

public class RankOfElement {
	   public static int countRank(int arr[],int key) {
		   int count=0;
		   for(int i=0; i<arr.length; i++) {
			   if(arr[i]<=key) {
				   count++;
			   }
		   }
		   return count;
	   }
       public static void main(String[] args) {
		      int arr[]= {10,20,15,3,4,4,1};
		      Scanner sc=new Scanner(System.in);
		      System.out.print("Enter key to find Rank :");
		      int key=sc.nextInt();
		      int rank=countRank(arr,key);
		      System.out.println("Rank of "+key+" is :"+rank);
	}
}
