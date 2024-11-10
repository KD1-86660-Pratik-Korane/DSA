package Question02;

import java.util.Scanner;

public class Tester {
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.print("Enter CircularQueue Size :");
    	   int size=sc.nextInt();
    	   CircularQueue cq=new CircularQueue(size);	  
    	   int choice;
    	   int value;
    	   int count=0;
    	   do {
    		  System.out.println("1. push\n2. pop\n3. peek\n\n4. Enter your choice :"); 
    		  choice=sc.nextInt();
    		  switch(choice) {
    		  case 1:
    			  if(count==size) {
    				  System.out.println("CircularQueue is full");
    			  }else{
    			    	 System.out.print("Enter value :");
        			     value=sc.nextInt();
        			     cq.push(value);
        			     count++;
    			     }   			    
    			     break;
    		  case 2:
    			      if(count==0) {
    			    	  System.out.println("CircularQueue is empty");
    			      }else {
    			    	  System.out.println("poped element : "+cq.pop());
    			      }
    			      break;
    		  case 3:
    			     if(count==0) {
    			    	 System.out.println("CircularQueue is empty");
    			     }else {
    			    	 System.out.println("peek element :"+cq.peek());
    			     }
    			     break;
    		  }
    	   }while(choice!=4);
    	   
    	   System.out.println("Thank You");
	}
}
