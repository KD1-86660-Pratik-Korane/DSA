package question03;

import java.util.Scanner;

public class Tester {
       public static void main(String[] args) {
    	     Scanner sc=new Scanner(System.in);
    	     System.out.print("Enter size :");
    	     int size=sc.nextInt();
		     LinearQueue lq=new LinearQueue(size);
		    
		     int choice;
		     int value;
		     do {
		    	 System.out.println("1. push\n2. pop\n3. peek\n4. Exit");
		    	 System.out.println();
		    	 System.out.print("Enter your choice :");
		    	 choice=sc.nextInt();
		    	 switch(choice) {
		    	 case 1: 		 
		    		   if(lq.isFull()) {
		    			   System.out.println("Queue is full");
		    		   }else {
		    			   System.out.print("Enter value :");
			    		   value=sc.nextInt();
		    			   lq.push(value);
		    		   }
		    		   break;
		    	 case 2:
		    		   if(lq.isEmpty()) {
		    			   System.out.println("Queue is Empty");
		    		   }else {
		    			    System.out.println("poped data :"+lq.pop());
		    		   }
		    		   break;
		    	 case 3:
		    		   if(lq.isEmpty()) {
		    			   System.out.println("Queue is Empty");
		    		   }else {
		    			   System.out.println("data at peek :"+lq.peek());
		    		   }
		               break;
		    	 }
		     }while(choice!=4);
	}
}
