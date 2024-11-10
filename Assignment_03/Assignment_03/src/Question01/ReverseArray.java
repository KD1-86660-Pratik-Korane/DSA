package Question01;

public class ReverseArray {
	public static void main(String[] args) {
		
		   int arr[]={10,20,30,40,50};
		   Stack s=new Stack(arr.length);
		   
		   int i;
		 
		   for(i = 0; i <arr.length; i++) {
			   
			  s.push(arr[i]);
		   }
		   
		   System.out.print("Reversed array using Stack :");
		   while(!s.isEmpty()) {
			    System.out.print(s.pop()+" ");
		   }
		   
	}
}

