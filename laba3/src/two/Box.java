package two;
import java.util.ArrayList;

public class Box extends Shape {

	
	double count=0;

	public Box(double b)
	{
		super(b);
	}
	public boolean add(Shape s)
	{
		if (count+s.volume>volume)
		{
			System.out.println("Not place!");
			return false;
		}
		else
		{
			System.out.println("Figure add!");
			count=count+s.volume;
			return true;
		}
	}
}