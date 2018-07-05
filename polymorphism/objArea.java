package polymorphism;

import myInterface.Circle;

public class objArea {

	static void area( Shape s) {
		
		 if (s instanceof Circle){
		 Circle c = (Circle)s;
		 System.out.println(c.area());
		 }else{
		 Square c = (Square)s;
		  System.out.println(c.area());
		  }
		 
		 
		//System.out.println(s.area());
		
	}
}

