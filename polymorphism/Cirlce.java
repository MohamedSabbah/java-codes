package polymorphism;

public class Cirlce extends Shape{
	int circleColor;
	double radius;
	double area() {
		
		return Math.PI * Math.pow(radius, 2);
		
	}

}
