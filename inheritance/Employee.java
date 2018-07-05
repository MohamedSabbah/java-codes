package inheritance;

 public class Employee {
	 
	 private String dept;
	int id ; 
	String name ;
	double salary;
	
	
	public Employee() {
		System.out.println("Hallo von Mitarbeiter");
	}


	public Employee(int id) {
		
		this.id = id;
	}


	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}


	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	String getDetails() {
		return id +"\t"+ name+"\t" + salary;
	}
	
	@Override
	public String toString() {
		String e = id +""+ name;
			
			return e;
	}

}
