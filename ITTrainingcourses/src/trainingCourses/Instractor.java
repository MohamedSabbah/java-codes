package trainingCourses;

abstract class Instractor {
	
	
	
	private String id;
	private String name;
	private String phone;
	
	private Course course = new Course();
	abstract double calcSalary ();	
	Instractor() {
			
	}
	
	Instractor(String id, String name, String phone, Course course) {
		
		this.setId(id);
		this.setName(name);
		this.setPhone(phone);
		this.setCourse(course);

	}
	
	// Getter and Setter
	
	Course getCourse() {
		return course;
	}

	void setCourse(Course course) {
		this.course = course;
	}

	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getPhone() {
		return phone;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}

	
	@Override
	public String toString() {
		return "Instractor [id=" + id + ", name=" + name + ", phone=" + phone + ", course=" + course + "]";
	}
	
	 

}
