package question02;

public class Tester {
	   
	   public static void selectionSort(Employee arr[]) {
		   for(int i=0; i<arr.length-1; i++) {
			   int index=i;
			   for(int j=i+1; j<arr.length; j++) {
				   if(arr[j].getSalary()<arr[index].getSalary()) {
					    index=j;
				   }
			   }
			   Employee temp=arr[index];
			   arr[index]=arr[i];
			   arr[i]=temp;
		   }
	   }
	
       public static void main(String[] args) {
    	   Employee arr[]=new Employee[5];
    	   arr[0]=new Employee(1,"Kiran",5000);
    	   arr[1]=new Employee(2,"Rahul",3000);
    	   arr[2]=new Employee(3,"Suraj",2500);
    	   arr[3]=new Employee(4,"Raj",4000);
    	   arr[4]=new Employee(5,"Sunil",3500);
    	   
    	   selectionSort(arr);
    	   for(int i=0; i<arr.length; i++) {
    		   System.out.println(arr[i].toString());
    	   }
	}
}
