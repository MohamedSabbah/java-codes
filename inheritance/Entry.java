package inheritance;

public class Entry {
	public static void main(String[] args) {
		
	Employee emp = new Employee();
		emp.id= 123;
		emp.name = "louan";
		emp.salary = 2000;
		
		
		Programmer pro = new Programmer("c#");
		// pro.dept = "asdfghjk"; ........error
		pro.id = 21;
		pro.name = "ahmed";
		pro.salary = 1925;
		
		
		Employee e = new Employee();
		e.id= 123;
		e.name = "louan";
		System.out.println(e);
	}

}
