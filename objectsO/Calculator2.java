package objectsO;

public class Calculator2 {
	
	
	 private int num1;
	 private int num2;
	public Calculator2() {
		
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		if (num2 == 0)
			throw new ArithmeticException("can not divide by zero");
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	public  void Calc(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void calc() {
		int num3 = num1 / num2;
		System.out.println("num3 = "+ num3);
	}

}
