package two;

public abstract class SolidOfRevolution extends Shape {
	
	double radius=0;
	
	public SolidOfRevolution(double radius)
	{
		super(radius);
		this. radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
}