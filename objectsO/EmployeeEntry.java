package objectsO;

public class EmployeeEntry {

	public static void main(String[] args) {
		
		Employee em = new Employee();
		em.dept = "markting";
		em.id = " 12345";
		em.name = "mohamed";
		Employee em1 = null;//new Employee();
		//em1.dept = "markting";
	//	em1.id = " 12345s";
	//	em1.name = "mohamed";
		
		System.out.println(em.equals(em1));
		

	}

}
