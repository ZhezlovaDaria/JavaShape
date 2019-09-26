package two;

public class Pyramid extends Shape {


public Pyramid(double s, double h)
	{
		super(s*h/3);
		this. h = h;
		this. s = s;
	}

	double s=0;
	double h=0;
}