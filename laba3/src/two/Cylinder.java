package two;

public class Cylinder extends SolidOfRevolution {
	
	
	public Cylinder(double height,double radius)
	{
		 super(3.14*height*radius*radius);
		 this. height = height;
		 this. radius = radius;
	}
	
	double height=0;

}