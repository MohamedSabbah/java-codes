package objectsO;

public class SimpleCalculater {
	double num1;
	double num2;
	double sum;
	double remainder;
	double power;
	double root;
	// Method..............................
	
	
	// sum 
	
	void sum() {
		sum = num1 + num2;
		System.out.printf("the sum is: %.2f", sum);
		
		
	}
	// remaider
	
	void remainder() {
		remainder = num1 % num2;
		System.out.printf("The Remainder is: %.2f", remainder);
		
		
	}
	// power
	
	void power() {
		power = Math.pow(num1, num2);
		System.out.printf("The Power is: %.2f",power);
		
	}
	// root
	void root() {
		root = Math.sqrt(num1);
		System.out.printf("The Root is: %.2f",root);
		root = Math.sqrt(num2);
		System.out.printf("The Root is: %.2f",root);
		
		
		
	}
	

}
