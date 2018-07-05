package mycenter;

class Client {
	private String id;
	private String name;
	private String phone;
	
	//------------------------------------------------------------------------------------------------------------
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	void prClients() {
		System.out.println(this.name + "\t"+ this.id+ "\t"+ this.phone);
		
	}
	

}
