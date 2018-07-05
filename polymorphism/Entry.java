package polymorphism;



public class Entry {

	public static void main(String[] args) {
		
	// Rule1
		{	Cirlce c = new Cirlce();
		c.circleColor = 23;
		c.shapeColor=22;
		
		
		// poly Casting
		Shape sh = new Cirlce(); // upward casting
		sh.shapeColor= 20;
		
		Object o = new Cirlce();
		// Squar s = new Circle();   //error
		// String s = new Circle(); // error
		// Circle cc = new Shape(); //Error 
		
		}
		{
			// Rule2
			Shape sh = new Cirlce();
			// Cirlce c = (Circle)sh ; // downward Casting 
			
			Square S = (Square)sh;
		}
			
	
	
		{	//2.
		Cirlce c = new Cirlce();
		c.radius =10;	
	
		Square s = new Square();
		s.l = 10;
		
	 objArea.area(s);
	 
		Shape sh = new Cirlce();
		((Cirlce)sh).radius = 10;
		System.out.println(sh.area());
		
		Shape sh2 = new Square();
		((Square)sh2).l = 22;
		System.out.println(sh2.area());
		}
	}

}
