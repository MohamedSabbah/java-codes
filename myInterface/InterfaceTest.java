package myInterface;

// public interface InterfaceA{}
// abstract interface InterfaceA{}
// final interface InerfaceA {} // Error
/*
interface InterfaceA{
	// Fields(Constants not Variables)
	public static final int x = 10;
	int y = 20;
	// int z ; // Error
	
	// Methods
	public abstract void method1();
	void method2();
	//void method3{}  //Error
}  */

/*
interface InterfaceA{
	void method1();
	
}
interface InterfaceB{
	void method1();
}





public class InterfaceTest implements InterfaceA, InterfaceB{

	public static void main(String[] args) {
		

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

} */

/*
class MyClass{
	
}
interface InterfaceA{
	void method1();
	
}
interface InterfaceB{
	void method2();
}
interface InterfaceC extends InterfaceB,InterfaceA{
	void method3();
	
}
// interfacec extends Myclass {} // Error

class Test implements InterfaceC{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
}  */
/*
interface InterfaceA{
	int method1();
	
}
interface InterfaceB{
	void method1();
}
// class test implements InterfaceA,InterfaceB{}  // Error
*/

/*
interface InterfaceA{
	int method1();
	
	// public
	default void method2() {
		System.out.println("Hello, from InterfaceA");
	}
	// final default void method4(){} // Error
	// synchronized default void methos4(){} //Error
	// static default void method3 (){} //Error
	// default String toString(){} // Error
	default String toString(int x) {return "";}
}

class ClassA implements InterfaceA{

	@Override
	public int method1() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void methods2() {
		System.out.println("Hello , from ClassA");
	}
	
}  */

// Class always wins over interface......
/*
interface  InterfaceA{
	default void method1() {
		System.out.println("Hello, from InterfaceA");
	}
}

 abstract class Test implements InterfaceA {
	
	 void method1(){
	 System.out.println("Hello, From ClassA");
	 
	 
	 }
	
	public abstract void method1();
	
	public static void main(String[] args) {
			
		
	}
} */
/*
interface  InterfaceA{
	default void method1() {
		System.out.println("Hello, from InterfaceA");
	}
}
class ClassA{
	public void method1() {
		System.out.println("hello,from ClassA");
	}
}
class ClassB extends ClassA implements InterfaceA{
	public static void main (String[]args) {
		ClassA a = new ClassA();
		a.method1();
	}
} */
// more specific interface/class wins less specific ones...
/*
interface  InterfaceA{
	default void method1() {
		System.out.println("Hello, from InterfaceA");
	}
}
interface  InterfaceB extends InterfaceA{
	default void method1() {
		System.out.println("Hello, from InterfaceB");
	}
}
class  ClassA implements InterfaceB{
	public static void main (String[]args) {
		ClassA a = new ClassA();
		a.method1();
	}
} */
/*
interface  InterfaceA{
	default void method1() {
		System.out.println("Hello, from InterfaceA");
	}
}
interface  InterfaceB {
	default void method1() {
		System.out.println("Hello, from InterfaceB");
	}
}
class  ClassA implements InterfaceB,InterfaceA{
	 public void method1() {
		System.out.println("Hello, from ClassA");
		InterfaceB.super.method1();
	 }
	 
	 
	public static void main (String[]args) {
		
		
		ClassA a = new ClassA();
		a.method1();
	}
}
*/
/*
interface  InterfaceA{
	static void method1() {
		System.out.println("Hello, from InterfaceA");
	}

 default void method2() {
	method1();
}
}
class  ClassA implements InterfaceA{
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.method2();
		//a.method1();
		//InterfaceA.super.method1(); // Error
		InterfaceA.method1();
	}
	
}
*/


class PersonalData{
	String name;
	String address;
	String phone;
}

class Student{
	PersonalData pd = new PersonalData();
	double score;
	
}

class Test {
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.score = 100;
		stu.pd.address= "hamburg";
		stu.pd.name = "louan";
		stu.pd.phone = "01255429680";
		System.out.println(stu.pd.address);
	}
}






































