import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Shape> shapes = new ArrayList<Shape>();

		shapes.add(new Circle(10));
		shapes.add(new Rectangle(7, 5));
		shapes.add(new Triangle(6, 7, 5, 7));

		for (Shape shape : shapes) {
			shape.calculateArea();
			shape.calculatePerimeter();

		}

	}

}
