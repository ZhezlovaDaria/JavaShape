package one;
import two.Shape;
import two.SolidOfRevolution;
import two.Cylinder;
import two.Pyramid;
import two.Ball;
import two.Box;
import java.util.ArrayList;



public class Main {
	public static void main(String[] args)
	{
		Box box=new Box(50);
		
		ArrayList<Shape> Cont=new ArrayList<Shape>();
		
		Shape pyr=new Pyramid(3,4);
		Shape cyl=new Cylinder(1,2);
		Shape ball=new Ball(20);
		if (box.add(pyr))
			Cont.add(pyr);
		if (box.add(cyl))
			Cont.add(cyl);
		if (box.add(ball))
			Cont.add(ball);
		
		
		
	}
}
