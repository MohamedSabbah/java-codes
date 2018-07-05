package mycenter;

class Courses {
	 private String id ;
	 private String title;
	 private int hours;
	 private double ratePerHours;
	 static double minRate;
	//---------------------------------------------------------------------------------------------------------------
	static {
		minRate = 50;
	}
	
	Courses() {
		
		
	}
	public String getId() {
		return id;
		
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getRatePerHours() {
		return ratePerHours;
	}
	public void setRatePerHours(double ratePerHours) {
		this.ratePerHours = ratePerHours;
	}
	public static double getMinRate() {
		return minRate;
	}
	public static void setMinRate(double minRate) {
		Courses.minRate = minRate;
	}
	public double calcCost() {
		double totalCost = hours * ratePerHours;
		return totalCost;
	}
	public static void changeMinRate(int x) {
		minRate += x;
	}
	

}
