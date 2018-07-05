package mycenter;

public class Entry {

	public static void main(String[] args) {
		//courses:.........................................
		
		Courses k = new Courses();
		k.setId("JA123");
		k.setHours(210);
		k.setRatePerHours(55);
		k.setTitle("Java");
		k.calcCost();
		k.changeMinRate(100);
	
		
		
		
		
		
		// Printer........................................
		Printer p = new Printer();
		p.printCourses(k);
		
	}

}
