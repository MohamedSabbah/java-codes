package trainingCourses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Course {
	
	private String id;
	private String title;
	private double hours;
	private double ratePerHour;
	static double minHourRate;
	
	static {
		minHourRate = 25.0;
	}

	Course() {
		
	}

	Course(String id, String title, double hours, double ratePerHour) {
		
		setId(id);
		setTitle(title);
		setHours(hours);
		setRatePerHour(ratePerHour);
	}

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

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
	
	public static void setMinRate(double minRate) {
		Course.minHourRate = minRate;
	}
	public static void changeMinRate(double x) {
		
		 x += minHourRate ;
		
	}
	public double calcCost() {
		double totalCost = hours * ratePerHour;
		return totalCost;
	}

	@Override
	public String toString() {
		return "course [id=" + id + ", title=" + title + ", hours=" + hours + ", ratePerHour=" + ratePerHour + "]";
	}
	void printArrayList(List<Course> l) {
		Iterator<Course> i = l.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}
	void checkCertain(List<Course> l, Course c) {
		l.contains(c);
		
	}
	void removeSpecified(List<Course> l) {
		l.remove(l.size()-1);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(hours);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		temp = Double.doubleToLongBits(ratePerHour);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (Double.doubleToLongBits(hours) != Double.doubleToLongBits(other.hours))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(ratePerHour) != Double.doubleToLongBits(other.ratePerHour))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	

}
