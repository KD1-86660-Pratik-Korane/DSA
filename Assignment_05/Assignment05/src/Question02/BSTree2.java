package Question02;

public class BSTree2 {
       static class Node{
    	   private int data;
    	   private Node left,right;
    	   public Node(int value) {
    		   data=value;
    		   left=right=null;
    	   }
       }
       private Node root;
       
       public BSTree2() {
    	   root=null;
       }
       
       public void addnode(Node trav,Node newNode) {
    	   if(trav==null) {
    		    return;
    	   }
    	   if(trav!=null) {
    		   if(newNode.data<=trav.data) {
        		   if(trav.left==null) {
        			   trav.left=newNode;
        		   }else {
        			   addnode(trav.left,newNode);
        		   }
        	   }else {
        		   if(trav.right==null) {
        			   trav.right=newNode;
        		   }else {
        			   addnode(trav.right,newNode);
        		   }
        	   }
    	   }
    	  
       }
       
       public void addNode(int value) {
    	   Node newNode=new Node(value);
    	   if(root==null) {
    		   root=newNode;
    		   return;
    	   }
    	   addnode(root,newNode);
       }
       
       public boolean searchnode(Node trav,int value) {
    	   if(trav==null) {
    		   return false;
    	   }
    	   if(trav.data==value) {
    		   return true;
    	   }else {
    		  return searchnode(trav.left,value) || searchnode(trav.right,value);
    	   }
    	    
    	   
       }
       
       public boolean searchNode(int value) {
    	   return searchnode(root,value);
       }
       
}
