package question01;

public class Tester {
       public static void main(String[] args) {
		
    	   SinglyCircularLinkedList list=new SinglyCircularLinkedList();
    	    list.addFirst(10);
    	    list.addFirst(20);
    	    list.addFirst(30);
            list.addLast(40);
            list.addPosition(25, 3);
            list.deleteLast();
//            list.deletePosition(2);
    	    list.display();
	}
}
