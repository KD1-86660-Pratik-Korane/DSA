package Question01;

public class BSTree1 {
       static class Node{
    	   private int data;
    	   private Node left,right;
    	   
    	   public Node(int value) {
    		   data=value;
    		   left=right=null;
    	   }
       }
       private Node root;
       
       public BSTree1() {
    	   root=null;
       }
       
       public boolean isEmpty() {
    	   return root==null;
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
       
       public void preorder(Node trav) {
    	   if(trav==null) {
    		   return;
    	   }
    	   System.out.print(trav.data+", ");
    	   preorder(trav.left);
    	   preorder(trav.right);
       }
       
       public void preOrder() {
    	   System.out.print("PreOrder traversal ->");
    	   preorder(root);
    	   System.out.println();
       }
}


















 
