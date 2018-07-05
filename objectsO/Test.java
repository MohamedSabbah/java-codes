package objectsO;

public class Test {
	
	public static int sum(int num1, int num2) {
		
		 int result = num1 + num2;
		
		 return result;
	}
	public static int sub(int num1, int num2) {
		
		 int result2 = num1 - num2;
		
		 return result2;
	}
	public static int multi(int num1, int num2) {
		int result3 = num1 *num2;
		
		divide(result3);
		return result3;
	}
	public static void divide(int result3) {
		int div = result3/2;
		System.out.printf(" the result is:%d", div);
	}
	public static int[] myMethod(int x, int y) {
		
		int myarr[]= new int [2];
		myarr [0]= x+ y;
		myarr [1]= x-y;
		
		return myarr;
		
	}
	public static  void myMethod2(int myarr[]) {
		myarr[0]= 60;
		for (int element : myarr)
			System.out.printf(" the result is:%d", element);
	}
	

	public static void main(String[] args) {
		sum(3,4);
		int result = sum(2,3);
		System.out.printf(" the result is:%d", result);
		
	
		int sub1 = sub(6,2);
		System.out.printf(" the result is:%d", sub1);
		
		int multi = multi(result,sub1);
		System.out.printf(" the result is:%d", multi);
		
		 int neuarr[]=  myMethod(10, 20);
		 for ( int element : neuarr)
			 System.out.printf(" the result is:%d", element);
		 myMethod2(neuarr);
	}

}
