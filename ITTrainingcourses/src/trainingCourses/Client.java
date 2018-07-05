package trainingCourses;

class Client {
	private String Name;
	private String phone; 
	private String email;
	
	
	Client() {
			
		}

	Client(String name, String phone, String email, Course course) {
		
		setName(name);
		setPhone(phone);
		setEmail(email);
		
	}
	
	// Getter an Setter
	String getName() {
		return Name;
	}
	void setName(String name) {
		Name = name;
	}
	String getPhone() {
		return phone;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	
	 String payClient() {
			String payment = null;
			
			double pay = 0;
			if (pay == 0)
				payment = " Not paid";
			if (pay != 0 )	
				payment = " Paid";
			return payment;
	 }
	 
	 @Override
		public String toString() {
			return "client [Name=" + Name + ", phone=" + phone + ", email=" + email + "]";
		}	

}
