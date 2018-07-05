package myInterface;

class Circle2 implements Circle{
	int radius;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI * radius * radius;
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return 2* PI *radius;
	}

	@Override
	public void setRadius(double radius) {
		// TODO Auto-generated method stub
		this.radius = (int)radius;
	}

	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return this.radius;
	}

}
