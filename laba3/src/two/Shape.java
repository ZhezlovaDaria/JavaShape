package two;

public abstract class Shape {
	
	protected double volume=0;
	
	public Shape(double v)
	{
		volume=v;
	}
	
	public double getVolume()
	{
		return volume;
	}
}
