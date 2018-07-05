package inheritance;

 public class Programmer  extends Employee{
	
	String proLang;

	 public Programmer() {
		 super(1);
		System.out.println("Hallo vom entwickler");
	}

	public Programmer(String proLang) {
		super(2,"mohamed");
		this.proLang = proLang;
	}
	String getDetails() {
		return id +"\t"+ name+"\t" + salary +"\t" + proLang;
	}
	
}
