package mycenter;

public class Printer {
	
	void printCourses(Courses p) {
		
		{ System.out.println("Hours: "+p.getHours()
			+ "\t"
			+ "Id: "+p.getId()
			+"\t"
			+ "Title: "+p.getTitle()
			+"\t"
			+"Rate Perhours: "+p.getRatePerHours()
			+"\t"
			+"Cost: "+p.calcCost());
		}
		{
			System.out.println("MinRate: "+p.minRate);
		}
		
	}
	void printClients() {
		Client c = new Client();
		{	System.out.println("Name: "+ c.getName()
		+ "\t"
		+ "Id: "+c.getId()
		+"\t"
		+ "Phone: "+c.getPhone());
		}
		
		{
			System.out.println("payment"+c.payClient());

		}
		
	}

}
