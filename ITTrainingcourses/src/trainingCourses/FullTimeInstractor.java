package trainingCourses;

class FullTimeInstractor extends Instractor {
	
	private double salary;
	private  double bonus;
	
	
	// Contractor
	
	FullTimeInstractor() {
		
	}

	FullTimeInstractor(double salary, double bonus, String id, String name, String phone, Course course) {
		super(id, name, phone , course);
		setSalary(salary);
		setBonus(bonus);
	}
	
	 // Getter and Setter
	
	double getSalary() {
		return salary;
	}


	void setSalary(double salary) {
		this.salary = salary;
	}


	double getBonus() {
		return bonus;
	}


	void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
    // Salary

	double calcSalary () {
		 salary += bonus;
		 return salary;
	}


	@Override
	public String toString() {
		return super.toString()+"flInstractor [salary=" + salary + ", bonus=" + bonus  + "]";
	}

    


	



	
	
	
	
	
	
	

}
