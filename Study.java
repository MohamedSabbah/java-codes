import java.util.Scanner;

public class Study {
  
	//  1. 
	static void printData() {
		System.out.println("ahmed\n122345t\n 12234567800");
	}
	
	//  2.
	static void sum(double x, double y) {
		double z = x * y ;
		System.out.println(z);
	}
	
	//  3.
	static double sub(int x, int y) {
		double z = x - y;
		return z;
	}
	
	// 4.
	 static  double circleArea(double r) {
	 double area = Math.PI * Math.pow(r, 2);
	 return area;
		 
		 
		 
	 }
	 
	 // 5.
	 static double squareArea(double w,double l) {
		 double area = w * l;
		 return area;
	 }

	public static void main(String[] args) {
		

		{
			double power =  (-5 + Math.sqrt(Math.pow(-5, 2) - 4 * (1.0/2)*(1/3.0)))/(2*(1.0/3)) ;
			System.out.println("\nthe power is : " +power);
			
		}
		
		
		//----------------------------------------------------------------------
		//----------------------------------------------------------------------
		// Taking The Number from The Users
		
		 System.out.println(" Please enter the year: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		//check the year with if statement
		if (year % 4 == 0) {
			if(year % 100 != 0) {
				System.out.println("The year is leap");
			}else if (year % 400 == 0) {
				System.out.println("The year is  leap");
			}
			
		}else {
			System.out.println("The year is  not leap");
		}
		//------------------------------------------------------
		//-------------------------------------------------------
		{ int num = 1, sum = 0;
		while( sum < 100) {	
		
			sum += num;
			num++;
		}System.out.println("The Number Qual to or Greater than 100:" + sum );}*/
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		   int  num = 21;
		   boolean isPrime = true;
		 for (int i = 2; i <= num/2; i++) {
			 if(num % i == 0) {
				 isPrime = false; 
				 break;
			 } 
		 }
		
		 if (isPrime == true) {
			 System.out.println("it is  prime");
		 }else {
			 System.out.println("it is not prime");
		 } 
		//---------------------------------------------------------
		
		
	
	
	
	}
		

}


