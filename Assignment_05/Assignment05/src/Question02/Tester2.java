package Question02;

 

public class Tester2 {
       public static void main(String[] args) {
    	   BSTree2 tree=new BSTree2();
    	   tree.addNode(40);
    	   tree.addNode(20);
    	   tree.addNode(15);
    	   tree.addNode(30);
    	   
    	   if(tree.searchNode(100)) {
    		   System.out.println("Node found");
    	   }else {
    		   System.out.println("Node doesn't exist");
    	   }    	    
	}
}
