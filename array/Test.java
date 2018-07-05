package array;

import java.util.Arrays;
 
class Employee{
	int id ; 
	String name;
	
	
	void getDetials() {
		System.out.printf("%d \n %s \t",id,name);
	}
	
 
}
public class Test {
	
	 static void printData(Employee []x) {
		for(Employee i : x) {
			i.getDetials();
			
		}
		
	}
	
	static void myMethod(int[]urArry) {
		Arrays.sort(urArry);
		System.out.print(Arrays.toString(urArry));
		
	}
	
	 // Single dimentional array.........................
	  // Declaration and initializzation....
	   
	{  int[] myArr = new int [3];
	   myArr [0] = 10;
	    myArr [1] = 20;
	     myArr [2] = 30;
	}  
	     {  int[] myArr2 = {31,20,50,66,80}; } // usage : lookup table.
	     
	     //size 
	     {  int[] myArr = new int [3]; }
	       
	     { int size =  20 *6 *10;
	       int[] myArr2= new int[size];
	     }
	       
	       final int size2 = 3;
	       int[] myArr3 = new int[size2]; 
	       
	       
	       // NOTE....
	        int [] arr, x;
	        int arr2[], x2;
	      
	        {   
	        
	        int[] myArr = new int [3];
			    myArr [0] = 10;
			    myArr [1] = 20;
			    myArr [2] = 30;
		 {
	        // for loop....
	         for (int i = 0; i < myArr.length; i++)
	          System.out.println(myArr[i]);
			    }
	          
	          
	          //  for ... each loop ......
		    
	         for (int i : myArr)
	           System.out.println(i);
		 
	    
	        }
	       
	public static void main (String[] args) {
		
		{	
		int[] myArr = {21,34,88,135,34,12,44,66,77,39};
		 for (int i  : myArr ) {
			if (i %2 !=0) 
				
		
			 
			 System.out.println(i);
			 }
		}
		 
		
		///////////////////////////////////////////////////////////////7
		{  // copy from array to array
			 int[] myArr2 = {21,34,88,135,34,12,44,66,77,39};  
			int []x = new int [3];
			for (int i = 0; i < myArr2.length; i++ ) {
				x [i] = myArr2[i];
				
			}for (int y : x)
				System.out.println(y);
			 int[] des = Arrays.copyOf(myArr2, myArr2.length);	
			 int[] des1 = Arrays.copyOfRange(myArr2, 0, 2);
			 
			 String s =  Arrays.toString(myArr2);
			 System.out.println(s);
			 
			 Arrays.sort(myArr2);
			 System.out.print(Arrays.toString(myArr2));
			 
			 
			Arrays.fill(myArr2, 132);
			Arrays.fill(myArr2, 4, 8,210);
			Arrays.sort(myArr2);
			 System.out.print(Arrays.binarySearch(myArr2, 77));
			 myMethod(myArr2);
		
		
		// Multidimentional array..........................................................
		// Declaration and Inilialization 
		
		
		int [][] myArr = new int [2][3];
		// ex.
		myArr [0][0] = 10;
		myArr [0][1] = 20;
		myArr [0][2] = 30;
		myArr [1][0] = 100;
		myArr [1][1] = 33;
		myArr [1][2] = 42;
		
		{
		int [][] myArr21 = {{10,20,30} , {89,31,87}};
		
		for(int row = 0; row < myArr.length; row++) {
			for(int col = 0; col < myArr[row].length; col++) {
				System.out.println(myArr[row][col]);
			}
		}
		}
		Employee emp1 = new Employee();
		emp1.id = 1;
		emp1.name = "Mohamed";
		
		Employee emp2 = new Employee();
		emp2.id = 2;
		emp2.name = "hamed";
		
		//..............................
		
		Employee[] myArr1 = new Employee [2];
		myArr1[0] = new Employee();
		myArr1[0].id = 122334;
		myArr1[0].name = "Mohamed";
		
		myArr1[1] = new Employee();
		myArr1[1].id = 27864534;
		myArr1[1].name = "hamza";
		//............................................
		myArr1[0]= emp1;
		myArr1[1]= emp2;
		printData(myArr1);
	
		}
	}
	
	
	 
	 
	

}
