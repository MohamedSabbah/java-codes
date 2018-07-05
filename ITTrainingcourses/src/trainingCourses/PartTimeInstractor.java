package trainingCourses;

public class PartTimeInstractor extends Instractor{
	
	private double hours ;
	private double ratePerHour;
	
	// Contractor
	
	PartTimeInstractor() {
		
	}

	PartTimeInstractor(double hours, double ratePerHour, String id, String name, String phone, Course course) {
		super( id ,  name , phone, course);
		setHours(hours);
		setRatePerHour(ratePerHour);	
	}

		//   Getter and Setter

	double getHours() {
		return hours;
	}


	void setHours(double hours) {
		this.hours = hours;
	}


	double getRatePerHour() {
		return ratePerHour;
	}


	void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

			//Salary

	double calcSalary() {
		double salary = hours * ratePerHour;
		return salary;
	}



	@Override
	public String toString() {
		return super.toString()+" ptInstractor [ hours=" + hours + ", ratePerHour= "+ ratePerHour +"]";
	}
	
	
	

}
