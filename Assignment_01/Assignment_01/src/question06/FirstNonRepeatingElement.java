package question06;

public class FirstNonRepeatingElement {
	   public static int findFirstNonRepeat(int arr[]) {
		   for(int i=0; i<arr.length; i++) {
			   int count=0;
			   for(int j=0; j<arr.length; j++) {
				   if(i!=j) {
					   if(arr[i]==arr[j]) {
						   count++;
					   }
				   }
				 
			   }
			   if(count==0) {
				   return arr[i];
			   }
		   }
		   return -1;
	   }
       public static void main(String[] args) {
		      int arr[]= {1,2,3,-1,2,1,0,4,-1,7,8,3,0};
		      int index=findFirstNonRepeat(arr);
		      if(index==-1) {
		    	  System.out.println("No such a Element");
		      }else {
		    	  System.out.println("First Non-Repeating Element : "+index);
		      }
	}
}
