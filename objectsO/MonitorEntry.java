package objectsO;

public class MonitorEntry {
	
	@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			super.finalize();
			System.out.println("good bye");
		}

	

	public static void main(String[] args) {
		
		Moniters mon = new Moniters ("lenovo", 17, "Black");
		mon.printData();
		
		System.out.println(mon);
		mon.brand = "lenovo";
		mon.color = "blue";
		mon.price = 1399;
		mon.size = 17;
		mon.printData();
		mon.calNewPrice(0.22);
		
		Moniters mon2 = new Moniters ();
		System.out.println(mon2);
		mon2.brand = "mac";
		mon2.color = "white";
		mon2.price = 1000;
		mon2.size = 19;
		mon2.printData();
		mon2.calNewPrice(0.1);
		mon2 = null;
		System.gc();
		
		Moniters mon3 = mon;
		System.out.println(mon3);
		 if (mon == mon2)
			System.out.println("the same");
		else
			System.out.println("diferent");
	} 

}
