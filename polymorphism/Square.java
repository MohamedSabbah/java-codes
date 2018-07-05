package polymorphism;

public class Square extends Shape {
	int squareColor;
	double l;
	double area() {
		return Math.pow(l, 2);
	}

}
