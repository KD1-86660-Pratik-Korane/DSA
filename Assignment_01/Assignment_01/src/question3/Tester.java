package question3;

import java.util.Scanner;

public class Tester {
	public static void binarySearchbyId(Employee arr[],int start,int end,int id) {
		if(start > end)
			return ;
		int mid = (start + end) / 2; 
		if(id == arr[mid].getEmpid()) {
			 System.out.println(arr[mid]);
		}
		else if(id < arr[mid].getEmpid()) {
			 binarySearchbyId(arr, start, mid - 1,id);
		}
		else 	 {
			 binarySearchbyId(arr, mid + 1, end,id);
		}
		 
	}
	
	
	public static void binarySearchbyName(Employee arr[],int start,int end,String name) {
		if(start == end)
			return ;
 
		if(name.equals(arr[start].getName())) {
			 System.out.println(arr[start].toString());
			 return;
		}
		else 	 {
			 binarySearchbyName(arr, start+ 1, end,name);
		}
		 
	}
	
	public static int menu(Scanner sc) {
		 System.out.println("0.Exit");
		   System.out.println("1.Search Employee by Id");
		   System.out.println("2. Search Employee by Name");
		   System.out.println();
		   System.out.println("Enter your choice :");
		   return sc.nextInt();
	}
	
       public static void main(String[] args) {
	   Employee arr[]=new Employee[5];
	   arr[0]=new Employee(1,"Kiran",5000);
	   arr[1]=new Employee(2,"Rahul",3000);
	   arr[2]=new Employee(3,"Prathamesh",4500);
	   arr[3]=new Employee(4,"Suraj",2500);
	   arr[4]=new Employee(5,"Rushi",3000);
	   Scanner sc=new Scanner(System.in);
	   
	   int choice;
	   
	   while((choice=menu(sc))!=0) {
		   switch(choice) {
		   case 1:
			   System.out.print("Enter empid to search Employee :");
			   int id=sc.nextInt();
			   binarySearchbyId(arr,0,arr.length,id);
			   break;
		   case 2:
			   System.out.println("Enter name to search Employee :");
			   String name=sc.next();
			   binarySearchbyName(arr,0,arr.length,name);
			   break;
		   }
	   }
	   
	   
	}
}
