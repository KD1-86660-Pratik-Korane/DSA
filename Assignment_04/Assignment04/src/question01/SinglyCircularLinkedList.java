package question01;

public class SinglyCircularLinkedList {
       static class Node{
    	   private int data;
    	   private Node next;
    	   public Node(int value) {
    		   data=value;
    		   next=null;
    	   }
       }
       
       private Node tail;
       private int size;
       public boolean isEmpty() {
    	   return tail==null;
       }
       
       public void addFirst(int value) {
    	      Node newNode=new Node(value);
    	      
    	      if(isEmpty()) {
    	    	   tail=newNode;
    	    	   tail.next=newNode;
    	      }else {
    	    	   newNode.next=tail.next;
    	    	   tail.next=newNode;
                   
    	      }
    	      size++;
       }
       
       public void addLast(int value) {
    	   Node newNode=new Node(value);
    	   
    	   if(isEmpty()) {
    		   tail=newNode;
    		   tail.next=newNode;
    	   }else {
    		    
    		   newNode.next=tail.next;
    		   tail.next=newNode;
    		   tail=newNode;
    		  
    	   }
    	   size++;
       }
       
       public void addPosition(int value,int pos) {
    	   Node newNode=new Node(value);
    	   if(isEmpty()) {
    		   return;
    	   }else if(pos==1) {
    		   addFirst(value);
    		   return;
    	   }else if(pos==size+1) {
    		   addLast(value);
    		   return;
    	   }else {
    		   Node trav=tail.next;
    		   for(int i=1; i<pos-1; i++) {
    			   trav=trav.next;
    		   }
    		   newNode.next=trav.next;
    		   trav.next=newNode;
    	   }
    	   size++;
       }
       
       public void deleteFirst() {
    	   if(isEmpty()) {
    		   return;
    	   }else {
    		   tail.next=tail.next.next;
    	   }
    	   size--;
       }
       
       public void deleteLast() {
    	   if(isEmpty()) {
    		   return;
    	   }else {
    		   Node trav=tail.next;
    		   while(trav.next!=tail) {
    			   trav=trav.next;
    		   }
    		   trav.next=tail.next;
    		   tail=trav;
    	   }
    	   size--;
       }
       
       public void deletePosition(int pos) {
    	   if(isEmpty()) {
    		   return;
    	   }else if(size==1) {
    		   tail=null;
    	   }else {
    		   Node trav=tail.next;
    		   for(int i=1; i<pos-1; i++) {
    			   trav=trav.next;
    		   }
    		   trav.next=trav.next.next;
    	   }
    	   size--;
       }
       
       public void display() {
    	   Node trav=tail.next;
    	   do {
    		   if(isEmpty()) {
    			   System.out.println("list is empty");
    			   return;
    		   }
    		   System.out.print(trav.data+"->");
    		   trav=trav.next;
    	   }while(trav!=tail.next);
       }
}
