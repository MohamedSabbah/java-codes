package objectsO;

public class Square {
	
	double length;
	double area;
	double circumference;
	// Methods ...................
	
	double calArea() {
		area = Math.pow(length, 2);
		System.out.printf("%f\n", area);
		return area;
		
	}
	
	double calCircumference(){
		circumference =  length * 4;
		System.out.printf("%f\n",circumference);
		return circumference;
	}

}
