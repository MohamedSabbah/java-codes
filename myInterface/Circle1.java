package myInterface;

class Circle1 implements Circle{
	
	private double radius;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI * Math.pow(radius, 2);
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return 2*PI * radius;
	}

	@Override
	public void setRadius(double radius) {
		if(radius <0)
			System.out.println("invalid Value");
		this.radius= radius;
		
	}

	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return this.radius;
	}
	

}
