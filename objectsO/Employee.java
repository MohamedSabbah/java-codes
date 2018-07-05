package objectsO;

public class Employee {
	String name;
	String id;
	String dept;

	
	@Override
	public boolean equals(Object emp1) {
		
		boolean b = false;
		Employee emp = (Employee)emp1;
		if (emp1 !=null && emp1 instanceof Employee) {
			if(this.name == emp.name && this.id == emp.id && this.dept == emp.dept)
			b = true;
		}

		return b;
	}
}
